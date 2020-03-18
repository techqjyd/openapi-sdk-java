package com.xinrenxinshi.openapi;

/**
 * 返回公共参数
 *
 * @author: liuchenhui
 * @create: 2019-10-25 16:12
 **/
public class OpenapiResponse extends AuthResult {
    private static final long serialVersionUID = 5014379068811962022L;

    private Integer errcode;
    private String errmsg;

    private String timestamp;

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
