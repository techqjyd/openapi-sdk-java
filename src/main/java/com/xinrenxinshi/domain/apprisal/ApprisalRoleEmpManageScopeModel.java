package com.xinrenxinshi.domain.apprisal;

public class ApprisalRoleEmpManageScopeModel {

    /**
     * 管理范围类型 1-部门 2-员工
     */
    private Integer manageScopeType;

    /**
     * 名称，部门名称或者员工姓名
     */
    private String manageScopeName;

    /**
     * 值，部门id或者员工id
     */
    private String manageScopeId;

    public Integer getManageScopeType() {
        return manageScopeType;
    }

    public void setManageScopeType(Integer manageScopeType) {
        this.manageScopeType = manageScopeType;
    }

    public String getManageScopeName() {
        return manageScopeName;
    }

    public void setManageScopeName(String manageScopeName) {
        this.manageScopeName = manageScopeName;
    }

    public String getManageScopeId() {
        return manageScopeId;
    }

    public void setManageScopeId(String manageScopeId) {
        this.manageScopeId = manageScopeId;
    }
}
