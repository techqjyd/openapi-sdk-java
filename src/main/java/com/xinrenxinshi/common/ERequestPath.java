package com.xinrenxinshi.common;

/**
 * @author wangyuan
 * @date 2020/7/2 下午5:01
 */
public enum ERequestPath {
    /**
     * 手机号免登
     */
    MOBILE_TOKEN("/v4/login/mobile/token", MethodEnum.METHOD_GET),
    MOBILE_LOGIN_PC("/v4/login/mobile/pc", MethodEnum.METHOD_GET),
    MOBILE_LOGIN_H5("/v4/login/mobile/h5", MethodEnum.METHOD_GET),
    ;
    /**
     * 请求方式
     */
    private MethodEnum method;
    /**
     * 请求路径
     */
    private String path;

    ERequestPath(String path, MethodEnum method) {
        this.path = path;
        this.method = method;
    }

    public MethodEnum getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }
}
