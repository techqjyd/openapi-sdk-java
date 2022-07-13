package com.xinrenxinshi.domain;

public class HolidayLeaveDayResult {
    /**
     * 假期余额
     */
    private Double leaveDay;

    /**
     * 假期过期时间  格式:2020/12/01
     */
    private String expiredTime;

    public Double getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(Double leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }
}
