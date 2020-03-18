package com.xinrenxinshi.domain;

/**
 * 城市信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:58
 **/
public class AreaInfo {
    /**
     * 区域编码
     */
    private Integer id;
    /**
     * 区域名称
     */
    private String name;
    /**
     * 区域类型，2-省级，3-城市，4-区级
     */
    private Integer type;
    /**
     * 父级区域编码id
     */
    private Integer parentId;
    /**
     * 是否主要区域，0-否，1-是
     */
    private Integer isPrimary;
    /**
     * 区域全称
     */
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
