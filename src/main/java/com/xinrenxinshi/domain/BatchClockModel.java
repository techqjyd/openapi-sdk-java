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
    private Integer source;
    private String remark;

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
