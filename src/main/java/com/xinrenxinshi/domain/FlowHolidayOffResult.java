package com.xinrenxinshi.domain;

import java.util.List;

public class FlowHolidayOffResult {
    /**
     * 假期类型
     */
    private Integer holidayType;

    /**
     * 假期名称
     */
    private String holidayName;

    /**
     * 是否是自定义假期
     */
    private Integer isDef;

    /**
     * 假期开始时间  格式:2020/12/01
     */
    private String startTime;

    /**
     * 假期结束时间
     */
    private String endTime;

    /**
     * 假期总余额
     */
    private Double plusDay;

    /**
     * 假期名称
     */
    private List<HolidayLeaveDayResult> leaveDays;

    public Integer getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(Integer holidayType) {
        this.holidayType = holidayType;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public Integer getIsDef() {
        return isDef;
    }

    public void setIsDef(Integer isDef) {
        this.isDef = isDef;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getPlusDay() {
        return plusDay;
    }

    public void setPlusDay(Double plusDay) {
        this.plusDay = plusDay;
    }

    public List<HolidayLeaveDayResult> getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(List<HolidayLeaveDayResult> leaveDays) {
        this.leaveDays = leaveDays;
    }
}
