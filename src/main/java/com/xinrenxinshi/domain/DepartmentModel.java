package com.xinrenxinshi.domain;

/**
 * 部门信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:24
 **/
public class DepartmentModel {
    /**
     * 管理员ID
     */
    private String adminId;
    /**
     * 所属城市
     */
    private String city;
    /**
     * 部门编码
     */
    private String code;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 上级部门ID
     */
    private String parentId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 部门类型,0表示部门,1表示事业部,2表示事业群,3表示组,4表示中心,5表示子公司
     */
    private Integer type;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
