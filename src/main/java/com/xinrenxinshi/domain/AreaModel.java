package com.xinrenxinshi.domain;

public class AreaModel {
    /**
     * 区域编号
     */
    public int id;
    /**
     * 区域名称
     */
    public String name;
    /**
     * 区域类型，2省，3市，4区
     */
    public int type;
    /**
     * 父级编号
     */
    public int parentId;
    /**
     * 是否省会
     */
    public int isPrimary;
    /**
     * 区域级联名称
     */
    public String fullName;

    public String adcode;
    /**
     * 区域类型，1-中国，2-国际化
     */
    public Integer areaType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(int isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }
}
