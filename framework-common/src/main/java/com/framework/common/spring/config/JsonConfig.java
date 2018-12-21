package com.framework.common.spring.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.framework.common.tool.DateTools;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.text.SimpleDateFormat;

/**
 * @Description: json配置
 * @Author: J.W
 * @Date: 下午5:26 2018/9/9
 */
public class JsonConfig {

    @Bean
    @Primary
    public ObjectMapper createJsonDeson() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.setDateFormat(new SimpleDateFormat(DateTools.TIME_PATTERN));
        AnnotationIntrospector intr = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(intr);
        return mapper;
    }

}
