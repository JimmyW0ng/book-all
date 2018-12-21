package com.framework.spring.boot.jooq.generator;

import com.google.common.collect.Lists;
import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;

import java.util.List;

/**
 * @Description: Jooq数据库生成代码
 * @Author: J.W
 * @Date: 上午11:24 2018/7/24
 */
public class GeneratorClass {

    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

    private static final String JOOQ_MYSQL = "org.jooq.util.mysql.MySQLDatabase";

    private static final String CUSTOM_GENERTOR = "com.framework.spring.boot.jooq.generator.CustomGenerator";

    /**
     * mysql数据库生成代码入口
     *
     * @param dbName        数据库名
     * @param url           数据库地址
     * @param user          用户名
     * @param password      密码
     * @param tableInclude  包含的表名（例如：包含全部 -> ".*"；包含member开头或message开头的表命 -> "^(member_|message_).*"）
     * @param codePackage   代码包（例如：com.xxx...domain）
     * @param codeDirectory 代码目录（module-xxx/src/main/java）
     * @throws Exception
     */
    public static void mysqlGgenerator(String dbName,
                                       String url,
                                       String user,
                                       String password,
                                       String tableInclude,
                                       String codePackage,
                                       String codeDirectory) throws Exception {
        List list = Lists.newArrayList();
        Schema schema = new Schema();
        schema.setInputSchema(dbName);
        list.add(schema);
        schema = new Schema();
        schema.setOutputSchemaToDefault(true);
        list.add(schema);
        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver(MYSQL_DRIVER)
                        .withUrl(url)
                        .withUser(user)
                        .withPassword(password))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withRecordVersionFields("version").withDateAsTimestamp(true)
                                .withName(JOOQ_MYSQL)
                                .withIncludes(tableInclude)
                                .withSchemata(list))
                        .withStrategy(new Strategy().withName(CUSTOM_GENERTOR))
                        .withGenerate(new Generate().withFluentSetters(true)
                                .withPojos(true).withDaos(true))
                        .withTarget(new Target()
                                .withPackageName(codePackage)
                                .withDirectory(codeDirectory)));
        GenerationTool.generate(configuration);
    }
}