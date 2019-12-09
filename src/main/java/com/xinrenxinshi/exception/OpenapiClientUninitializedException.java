package com.xinrenxinshi.exception;

/**
 * openapi未初始化异常
 *
 * @author: liuchenhui
 * @create: 2019-11-13 11:05
 **/
public class OpenapiClientUninitializedException extends RuntimeException {

    public OpenapiClientUninitializedException() {
    }

    public OpenapiClientUninitializedException(String msg) {
        super(msg);
    }

    public OpenapiClientUninitializedException(String msg, Throwable t) {
        super(msg, t);
    }
}
