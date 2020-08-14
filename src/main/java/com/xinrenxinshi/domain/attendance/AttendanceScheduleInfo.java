package com.xinrenxinshi.domain.attendance;

import java.util.List;

/**
 * 当前描述：考勤排班结果
 *
 * @author: jiazijie
 * @since: 2020/8/13 下午7:16
 */
public class AttendanceScheduleInfo {

    /**
     * 排班方案信息
     */
    private List<AttendanceClockPlainDetails> clockPlainDetails;


    /**
     * 员工排班信息
     */
    private List<AttendanceEmployeeSchedule> employeeSchedulings;

    public List<AttendanceClockPlainDetails> getClockPlainDetails() {
        return clockPlainDetails;
    }

    public void setClockPlainDetails(List<AttendanceClockPlainDetails> clockPlainDetails) {
        this.clockPlainDetails = clockPlainDetails;
    }

    public List<AttendanceEmployeeSchedule> getEmployeeSchedulings() {
        return employeeSchedulings;
    }

    public void setEmployeeSchedulings(List<AttendanceEmployeeSchedule> employeeSchedulings) {
        this.employeeSchedulings = employeeSchedulings;
    }

    public AttendanceScheduleInfo(List<AttendanceClockPlainDetails> clockPlainDetails, List<AttendanceEmployeeSchedule> employeeSchedulings) {
        this.clockPlainDetails = clockPlainDetails;
        this.employeeSchedulings = employeeSchedulings;
    }

    public AttendanceScheduleInfo() {
    }
}
