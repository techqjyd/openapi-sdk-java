package com.xinrenxinshi.domain.payroll;


import java.io.Serializable;

/**
 * @author : lz
 * create at:  2019-11-20  16:30
 * @program open_api
 * @description:
 */
public class PayrollChangeHistoryInfoModel implements Serializable {

    private String employeeId;
    private String name;
    private String mobile;
    private String jobNumber;

    private String departmentName;
    private String departmentId;
    private Integer hireType;
    private double valueBefore;
    private double valueAfter;
    private double totalBasePayBefore;
    private double totalBasePayAfter;
    private String happenDate;
    private int addtime;
    private String changeRate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String deparmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public double getValueBefore() {
        return valueBefore;
    }

    public void setValueBefore(double valueBefore) {
        this.valueBefore = valueBefore;
    }

    public double getValueAfter() {
        return valueAfter;
    }

    public void setValueAfter(double valueAfter) {
        this.valueAfter = valueAfter;
    }

    public double getTotalBasePayBefore() {
        return totalBasePayBefore;
    }

    public void setTotalBasePayBefore(double totalBasePayBefore) {
        this.totalBasePayBefore = totalBasePayBefore;
    }

    public double getTotalBasePayAfter() {
        return totalBasePayAfter;
    }

    public void setTotalBasePayAfter(double totalBasePayAfter) {
        this.totalBasePayAfter = totalBasePayAfter;
    }

    public String getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(String happenDate) {
        this.happenDate = happenDate;
    }

    public int getAddtime() {
        return addtime;
    }

    public void setAddtime(int addtime) {
        this.addtime = addtime;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate;
    }

    @Override
    public String toString() {
        return "PayrollChangeHistoryInfoModel{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", jobNumber='" + jobNumber + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", hireType=" + hireType +
                ", valueBefore=" + valueBefore +
                ", valueAfter=" + valueAfter +
                ", totalBasePayBefore=" + totalBasePayBefore +
                ", totalBasePayAfter=" + totalBasePayAfter +
                ", happenDate='" + happenDate + '\'' +
                ", addtime=" + addtime +
                ", changeRate='" + changeRate + '\'' +
                '}';
    }
}