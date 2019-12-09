package com.xinrenxinshi.common;

/**
 * 部门类型枚举
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:30
 **/
public enum DepartTypeEnum {

    /**
     * 部门
     */
    DEPARTMENT(0, "部门"),
    /**
     * 事业部
     */
    DIVISION(1, "事业部"),
    /**
     * 事业群
     */
    ENTERPRISE_GROUP(2, "事业群"),
    /**
     * 组
     */
    GROUP(3, "组"),
    /**
     * 中心
     */
    CENTER(4, "中心"),
    /**
     * 子公司
     */
    SUBSIDIARY(5, "子公司");

    private Integer type;
    private String description;

    DepartTypeEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
