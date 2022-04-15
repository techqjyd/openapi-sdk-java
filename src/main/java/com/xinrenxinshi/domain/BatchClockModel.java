package com.xinrenxinshi.domain;

/**
 * <一句话描述>
 * <详细介绍>
 *
 * @author Shi Yang
 * @since 需求wiki
 */
public class BatchClockModel {
    private String mobile;
    private String employeeId;
    private Integer clockTime;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getClockTime() {
        return clockTime;
    }

    public void setClockTime(Integer clockTime) {
        this.clockTime = clockTime;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
