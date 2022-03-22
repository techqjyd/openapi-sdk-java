package com.xinrenxinshi.domain.attendance;

/**
 * 打卡方案简单结果对象
 * @Author panhuiwen
 * @Date 2021/12/27 18:39
 */
public class AttendanceSimplePlanInfo {
    //方案id
    private Integer clockPlanId;
    //方案名称
    private String clockPlanName;

    public Integer getClockPlanId() {
        return clockPlanId;
    }

    public void setClockPlanId(Integer clockPlanId) {
        this.clockPlanId = clockPlanId;
    }

    public String getClockPlanName() {
        return clockPlanName;
    }

    public void setClockPlanName(String clockPlanName) {
        this.clockPlanName = clockPlanName;
    }
}
