package com.framework.common.spring.component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Description: json工具类
 * @Author: J.W
 * @Date: 下午5:26 2018/9/9
 */
public class JsonComponent {

    public static String encode(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = SpringComponent.getBean(ObjectMapper.class);
        return objectMapper.writeValueAsString(obj);
    }

    public static <T> T decode(String json, Class<T> classOfT) throws IOException {
        ObjectMapper objectMapper = SpringComponent.getBean(ObjectMapper.class);
        return objectMapper.readValue(json, classOfT);
    }

}
