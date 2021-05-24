package com.xinrenxinshi.domain;

import java.io.Serializable;

/**
 * @author by peilizhi
 * @date 2021/5/19 14:45
 */
public class PreDismissEmployee implements Serializable {
    /**
     * 员工编号
     */
    private String employeeId;
    /**
     * 员工工号
     */
    private String jobNumber;
    /**
     * 员工手机号
     */
    private String mobile;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工预离职时间
     * 时间格式是yyyy-MM-dd
     */
    private String preDismissionDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreDismissionDate() {
        return preDismissionDate;
    }

    public void setPreDismissionDate(String preDismissionDate) {
        this.preDismissionDate = preDismissionDate;
    }
}
