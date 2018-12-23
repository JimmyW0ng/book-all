package com.book.api;

import com.book.api.config.Swagger2Config;
import com.framework.common.spring.component.SpringComponent;
import com.framework.common.spring.config.JsonConfig;
import com.framework.spring.boot.jooq.config.JooqSingleDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @Description api服务
 * @Author J·W
 * @Date 2018/12/20 10:09
 **/
@ComponentScan(basePackages = {
        "com.book.api",
        "com.book.core"
})
@Import({
        // spring自定义组件
        SpringComponent.class,
        // api接口文档配置
        Swagger2Config.class,
        // 数据库配置
        JooqSingleDataSourceConfig.class,
        // json配置
        JsonConfig.class
})
@SpringBootApplication
public class ApiBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ApiBootstrap.class, args);
    }

}
