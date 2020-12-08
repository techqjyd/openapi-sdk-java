package com.xinrenxinshi.common;

/**
 * 免登pc端的跳转地址
 *
 * @author zhaopengcheng
 */
public enum EPcUrlTypeEnum {
    /**
     * 首页
     */
    HOME_PAGE(0, "首页"),
    /**
     * 审批列表
     */
    APPROVAL_DETAIL(1, "审批详情");


    /**
     * 跳转页面类型
     */
    private Integer redirectUrlType;
    /**
     * 描述
     */
    private String description;

    EPcUrlTypeEnum(Integer redirectUrlType, String description) {
        this.redirectUrlType = redirectUrlType;
        this.description = description;
    }

    public Integer getRedirectUrlType() {
        return redirectUrlType;
    }

    public void setRedirectUrlType(Integer redirectUrlType) {
        this.redirectUrlType = redirectUrlType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
