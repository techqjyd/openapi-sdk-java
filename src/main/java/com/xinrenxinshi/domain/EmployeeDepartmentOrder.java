package com.xinrenxinshi.domain;

public class EmployeeDepartmentOrder {
    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 员工兼职序号
     */
    private String jobRecordSeqNumber;

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * 记录类型
     */
    private Integer jobType;

    /**
     * 100000 - 默认顺序
     */
    private Integer position;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobRecordSeqNumber() {
        return jobRecordSeqNumber;
    }

    public void setJobRecordSeqNumber(String jobRecordSeqNumber) {
        this.jobRecordSeqNumber = jobRecordSeqNumber;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }


    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
