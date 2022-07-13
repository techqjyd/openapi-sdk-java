package com.xinrenxinshi.domain.approval;

public class ExpressionResult {
    private String id;
    private String name;
    private String type;//0-字段、 1-数值、 2-符号
    private String value;
    private Integer isExp;//是否是表达式 0-否，1是
    private Integer isDel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIsExp() {
        return isExp;
    }

    public void setIsExp(Integer isExp) {
        this.isExp = isExp;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
