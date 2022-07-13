package com.xinrenxinshi.domain;

public class FlowHolidayTypeResult {
    /**
     * 假期类型
     */
    private Integer holidayType;
    /**
     * 假期类型名称
     */
    private String holidayName;
    /**
     * 请假的单位
     * HolidayLeaveTimeUnit
     * 0=按天
     * 1=按小时
     * 2=按天或按小时
     */
    private Integer timeUnit;
    /**
     * 是否自定义假期 0否 1是
     */
    private Integer isDef;
    /**
     * 设置假期余额 开关，0—关闭，1—打开
     */
    private Integer isSetHolidayBalance;

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

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getIsDef() {
        return isDef;
    }

    public void setIsDef(Integer isDef) {
        this.isDef = isDef;
    }

    public Integer getIsSetHolidayBalance() {
        return isSetHolidayBalance;
    }

    public void setIsSetHolidayBalance(Integer isSetHolidayBalance) {
        this.isSetHolidayBalance = isSetHolidayBalance;
    }
}
