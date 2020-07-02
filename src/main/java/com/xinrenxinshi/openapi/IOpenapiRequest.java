package com.xinrenxinshi.openapi;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * 请求参数接口
 *
 * @author: liuchenhui
 * @create: 2019-11-04 20:23
 **/
public interface IOpenapiRequest<T extends OpenapiResponse> {

    /**
     * 获取请求方法
     */
    MethodEnum getMethod();

    /**
     * 获取返回参数的class
     */
    Class<T> getResponseClass();

    /**
     * 获取返回参数类型
     * @return 这个必须重写，
     */
    default TypeReference<T> getResponseTypeRef() {
        return null;
    }

    /**
     * 参数前置检查
     */
    void check() throws ParamNotValidException;

    /**
     * 获取参数map
     */
    Map<String, Object> getParamMap();

    /**
     * 获取请求头
     */
    Map<String, String> getHeaderMap();

    /**
     * 获取业务url
     */
    String getBizUrl();
}
