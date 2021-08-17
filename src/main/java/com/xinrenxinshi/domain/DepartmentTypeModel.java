package com.xinrenxinshi.domain;

/**
 * <一句话描述>.
 *
 * @author peng cheng
 * @date 2021/8/12
 * @since
 */
public class DepartmentTypeModel {

    /**
     * 部门类型
     */
    private Integer departType;

    /**
     * 部门类型名称
     */
    private String departTypeName;

    /**
     * 是否是固定的部门类型
     */
    private Integer isFixed;

    public Integer getDepartType() {
        return departType;
    }

    public void setDepartType(Integer departType) {
        this.departType = departType;
    }

    public String getDepartTypeName() {
        return departTypeName;
    }

    public void setDepartTypeName(String departTypeName) {
        this.departTypeName = departTypeName;
    }

    public Integer getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Integer isFixed) {
        this.isFixed = isFixed;
    }
}
