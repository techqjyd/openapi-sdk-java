package com.xinrenxinshi.common;

/**
 * <免登跳转类型>.
 *
 * @author peng cheng
 * @date 2020/11/26
 * @since
 */
public enum ERedirectTypeEnum {

    /**
     * 免登端口
     */
    PC(0, "pc"),
    H5(1, "h5"),
    ;
    /**
     * 登录类型
     */
    private Integer loginType;
    /**
     * 登录描述
     */
    private String desc;

    ERedirectTypeEnum(Integer loginType, String desc) {
        this.loginType = loginType;
        this.desc = desc;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public String getDesc() {
        return desc;
    }
}
