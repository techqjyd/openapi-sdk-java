package com.xinrenxinshi.common;

/**
 * 聘用类型
 *
 * @author: liuchenhui
 * @create: 2019-11-06 17:40
 **/
public enum HireTypeEnum {
    /**
     * 正式
     */
    OFFICIAL(0, "正式"),
    /**
     * 实习
     */
    PRACTICE(10, "实习"),
    /**
     * 顾问
     */
    COUNSELOR(12, "顾问"),
    /**
     * 返聘
     */
    REEMPLOY(13, "返聘"),
    /**
     * 劳务
     */
    LABOUR(11, "劳务");

    /**
     * 聘用类型
     */
    private Integer hireType;
    /**
     * 描述
     */
    private String description;

    HireTypeEnum(Integer hireType, String description) {
        this.hireType = hireType;
        this.description = description;
    }

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
