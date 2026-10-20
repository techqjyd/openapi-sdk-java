package com.xinrenxinshi.domain.approval;

public class EmployeeOvertimeDateDO {
    private Integer markId;
    private Integer eventDate;
    private Integer attendanceDate;
    private String overtimeRatio;

    public Integer getMarkId() {
        return markId;
    }

    public void setMarkId(Integer markId) {
        this.markId = markId;
    }

    public Integer getEventDate() {
        return eventDate;
    }

    public void setEventDate(Integer eventDate) {
        this.eventDate = eventDate;
    }

    public Integer getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Integer attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getOvertimeRatio() {
        return overtimeRatio;
    }

    public void setOvertimeRatio(String overtimeRatio) {
        this.overtimeRatio = overtimeRatio;
    }
}