package com.xinrenxinshi.domain;


import java.io.Serializable;

/**
 * 考勤原始打卡记录
 */
public class AttendanceRecord implements Serializable {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 打卡记录ID
     */
    private String clockRecordId;

    /**
     * 打卡时间
     */
    private int clockTime;

    /**
     * 打卡来源
     */
    private int source;

    /**
     * 备注信息
     */
    private String remark;


    public AttendanceRecord() {
    }

    public String getClockRecordId() {
        return clockRecordId;
    }

    public void setClockRecordId(String clockRecordId) {
        this.clockRecordId = clockRecordId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getClockTime() {
        return clockTime;
    }

    public void setClockTime(int clockTime) {
        this.clockTime = clockTime;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
