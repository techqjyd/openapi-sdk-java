package com.xinrenxinshi.domain.apprisal;

import java.util.List;

public class ApprisalKpiRoleEmployeeModel {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;


    /**
     * 管理范围list
     */
    private List<ApprisalRoleEmpManageScopeModel> manageScopeList;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<ApprisalRoleEmpManageScopeModel> getManageScopeList() {
        return manageScopeList;
    }

    public void setManageScopeList(List<ApprisalRoleEmpManageScopeModel> manageScopeList) {
        this.manageScopeList = manageScopeList;
    }
}
