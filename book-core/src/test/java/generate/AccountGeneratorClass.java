package generate;

import com.framework.spring.boot.jooq.generator.GeneratorClass;

/**
 * @Description: 数据库代码生成
 * @Author: J.W
 * @Date: 下午3:06 2018/9/13
 */
public class AccountGeneratorClass {

    public static void main(String[] args) throws Exception {
        String dbName = "book";
        String url = "jdbc:mysql://sh-cdb-el8935il.sql.tencentcdb.com:63360/book?useUnicode=true&amp;characterEncoding=UTF-8&amp;zeroDateTimeBehavior=convertToNull&amp;autoReconnect=true";
        String user = "root";
        String password = "gdqhENwd6q95Af18";
        String tableInclude = "^(authority_|member_|message_|spider_).*";
        String codePackage = "com.book.core.domain";
        String codeDirectory = "book-core/src/main/java";
        GeneratorClass.mysqlGgenerator(dbName, url, user, password, tableInclude, codePackage, codeDirectory);
    }

}