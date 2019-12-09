package com.xinrenxinshi.exception;

/**
 * 参数校验异常
 *
 * @author: liuchenhui
 * @create: 2019-11-13 11:02
 **/
public class ParamNotValidException extends RuntimeException {
    public ParamNotValidException() {
    }

    public ParamNotValidException(String msg) {
        super(msg);
    }

    public ParamNotValidException(String msg, Throwable t) {
        super(msg, t);
    }
}
