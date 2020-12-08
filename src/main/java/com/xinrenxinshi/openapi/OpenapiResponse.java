package com.xinrenxinshi.openapi;

/**
 * 返回公共参数
 *
 * @author: liuchenhui
 * @create: 2019-10-25 16:12
 **/
public class OpenapiResponse<T> {
    private static final long serialVersionUID = 5014379068811962022L;

    private Integer errcode;
    private String errmsg;

    private T data;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
