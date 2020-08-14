package com.xinrenxinshi.domain.attendance;

/**
 * 当前描述：员工排班信息
 *
 * @author: jiazijie
 * @since: 2020/8/13 下午6:22
 */
public class AttendanceEmployeeSchedule {

    /**
     * 员工ID
     */
    private String employeeId;

    /**
     * 方案ID
     */
    private String planId;

    /**
     * 排班ID
     */
    private String schedulingId;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(String schedulingId) {
        this.schedulingId = schedulingId;
    }
}
