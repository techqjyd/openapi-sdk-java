package com.xinrenxinshi.common;

/**
 * 请求方法枚举
 *
 * @author: liuchenhui
 * @create: 2019-11-01 12:01
 **/
public enum MethodEnum {

    /**
     * POST请求
     */
    METHOD_POST("POST"),
    /**
     * GET请求
     */
    METHOD_GET("GET");

    private String method;

    MethodEnum(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
