package com.xinrenxinshi.common;

/**
 * 是否包含子部门员工enum
 *
 * @author: liuchenhui
 * @create: 2019-11-12 14:34
 **/
public enum FetchChildEnum {

    /**
     * 包含子部门
     */
    CONTAINS_DEPARTMENT(1, "包含"),
    /**
     * 不包含子部门
     */
    DOES_NOT_CONTAIN_SUB_DEPARTMENTS(0, "不包含");
    private Integer fetchChild;
    private String description;

    FetchChildEnum(Integer fetchChild, String description) {
        this.fetchChild = fetchChild;
        this.description = description;
    }

    public Integer getFetchChild() {
        return fetchChild;
    }

    public void setFetchChild(Integer fetchChild) {
        this.fetchChild = fetchChild;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
