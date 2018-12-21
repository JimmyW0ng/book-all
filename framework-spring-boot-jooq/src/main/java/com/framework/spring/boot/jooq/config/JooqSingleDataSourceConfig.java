package com.framework.spring.boot.jooq.config;

import com.zaxxer.hikari.HikariDataSource;
import org.jooq.*;
import org.jooq.conf.*;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListener;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.jooq.tools.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Description: Jooq单数据源配置
 * @Author: J.W
 * @Date: 上午11:24 2018/7/24
 */
public class JooqSingleDataSourceConfig {

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${spring.datasource.driverClassName}")
    private String dataSourceClassName;

    @Value("${spring.datasource.hikari.idleTimeout}")
    private int connectionTimeout;

    @Value("${spring.datasource.hikari.maximumPoolSize}")
    private int maximumPoolSize;

    @Bean("dataSource")
    @Primary
    public DataSource primaryDataSource() {
        final HikariDataSource ds = new HikariDataSource();
        ds.setMaximumPoolSize(maximumPoolSize);
        ds.setIdleTimeout(connectionTimeout);
        ds.setDriverClassName(dataSourceClassName);
        ds.setJdbcUrl(dataSourceUrl);
        ds.setUsername(user);
        ds.setPassword(password);
        return ds;
    }

    @Bean
    public Configuration jooqConfig(@Autowired ConnectionProvider connectionProvider, @Autowired
            ExecuteListenerProvider executeListenerProvider) {
        Settings settings = SettingsTools.defaultSettings();
        settings.setStatementType(StatementType.PREPARED_STATEMENT);
        settings.withRenderMapping(new RenderMapping().withSchemata(new MappedSchema().withInput("hzg").withOutput("hzg")));
        Configuration derive = new DefaultConfiguration()
                .derive(connectionProvider)
                .derive(settings)
                .derive(executeListenerProvider)
                .derive(SQLDialect.MYSQL)
                .set(DefaultExecuteListenerProvider.providers(new SlowQueryListener()));
        return derive;
    }

    @Bean
    public DSLContext dsl(@Autowired Configuration jooqConfig) {
        return new DefaultDSLContext(jooqConfig);
    }

    class SlowQueryListener extends DefaultExecuteListener {

        private final Long SLOW_QUERY_TIME_LIMIT = 1_000_000_000L;
        private Logger logger = LoggerFactory.getLogger(SlowQueryListener.class);
        private StopWatch watch;

        @Override
        public void executeStart(ExecuteContext ctx) {
            super.executeStart(ctx);
            watch = new StopWatch();
        }

        @Override
        public void executeEnd(ExecuteContext ctx) {

            super.executeEnd(ctx);
            try {
                //记录执行时间超过1s的操作
                if (watch.split() > SLOW_QUERY_TIME_LIMIT) {
                    ExecuteType type = ctx.type();
                    StringBuilder sqlBuffer = new StringBuilder();
                    if (type == ExecuteType.BATCH) {
                        for (String query : ctx.batchSQL()) {
                            sqlBuffer.append(query).append("\n");
                        }
                    } else {
                        sqlBuffer.append(ctx.sql() == null ? "blank query " : ctx.sql());
                    }
                    logger.error("出现慢查询语句: {}", sqlBuffer.toString());
                }
            } catch (Exception e) {
                logger.error("慢查询语句监听报错，请及时修复!!!", e);
            }
        }
    }

}
