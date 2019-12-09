package com.xinrenxinshi.exception;

/**
 * api异常
 *
 * @author: liuchenhui
 * @create: 2019-10-25 16:10
 **/
public class ApiException extends Exception {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ApiException() {
    }

    public ApiException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ApiException(String msg) {
        super(msg);
    }

    public ApiException(String msg, Throwable t) {
        super(msg, t);
    }
}
