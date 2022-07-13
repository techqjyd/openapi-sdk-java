package com.xinrenxinshi.common;

/**
 * 聘用类型
 *
 * @author: liuchenhui
 * @create: 2019-11-12 15:10
 **/
public enum LaborTypeEnum {
    /**
     * 实习
     */
    PRACTICE(10, "实习"),
    /**
     * 劳务
     */
    LABOUR(11, "劳务"),
    /**
     * 顾问
     */
    COUNSELOR(12, "顾问"),
    /**
     * 返聘
     */
    REEMPLOY(13, "返聘"),
    /**
     * 外包
     */
    OUTSOURCING(14, "外包"),
    /**
     * 兼职
     */
    PARTTIME(15,"兼职");
    /**
     * 聘用类型
     */
    private Integer laborType;
    /**
     * 描述
     */
    private String description;

    LaborTypeEnum(Integer laborType, String description) {
        this.laborType = laborType;
        this.description = description;
    }

    public Integer getLaborType() {
        return laborType;
    }

    public void setLaborType(Integer laborType) {
        this.laborType = laborType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
