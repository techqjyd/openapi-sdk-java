package com.xinrenxinshi.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * jsonutil方法
 *
 * @author: liuchenhui
 * @create: 2019-10-25 17:12
 **/
public class JsonUtils {

    public static String toJson(Object object) {
        return JSON.toJSONString(object);
    }

    public static <T extends OpenapiResponse> T formJson(Class<T> clazz, String body) {
        return JSON.parseObject(body, clazz);
    }

    public static <T extends OpenapiResponse> T formJson(String body, TypeReference<T> reference) {
        return JSON.parseObject(body, reference);
    }
}
