package com.framework.spring.boot.jooq.generator;

import org.jooq.tools.StringUtils;
import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

/**
 * @Description: Jooq自定义数据库代码生成规则
 * @Author: J.W
 * @Date: 上午11:24 2018/7/24
 */
public class CustomGenerator extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        return this.getJavaClassName0(definition, mode);
    }

    private String getJavaClassName0(Definition definition, Mode mode) {
        StringBuilder result = new StringBuilder();
        result.append(StringUtils.toCamelCase(definition.getOutputName()
                .replace(' ', '_')
                .replace('-', '_')
                .replace('.', '_')));
        if (mode == Mode.RECORD) {
            result.append("Record");
        } else if (mode == Mode.DAO) {
            result.append("Repository");
        } else if (mode == Mode.INTERFACE) {
            result.insert(0, "I");
        } else if (mode == Mode.POJO) {
            result.append("Po");
        }

        return result.toString();
    }

}
