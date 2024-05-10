package com.xinrenxinshi.domain.attendance;

public class AttendanceStatusRangeResult {
    /**
     * 开始日期，yyyy-MM-dd
     */
    private String startDate;
    /**
     * 结束日期, yyyy-MM-dd
     */
    private String endDate;
    /**
     * 状态，0-正常，1-外勤，2-出差，3-外出，4-请假
     */
    private Integer status;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
