package com.xinrenxinshi.common;

/**
 * 聘用类型
 *
 * @author: liuchenhui
 * @create: 2019-11-06 17:40
 **/
public enum SimpleHireTypeEnum {
    /**
     * 正式
     */
    OFFICIAL(0, "正式"),
    /**
     * 非正式
     */
    INFORMAL(1, "非正式");

    /**
     * 聘用类型
     */
    private Integer hireType;
    /**
     * 描述
     */
    private String description;

    SimpleHireTypeEnum(Integer hireType, String description) {
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
