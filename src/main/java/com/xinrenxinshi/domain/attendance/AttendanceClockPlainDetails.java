package com.xinrenxinshi.domain.attendance;

import java.util.List;

/**
 * 当前描述：
 *
 * @author: jiazijie
 * @since: 2020/8/13 下午6:22
 */
public class AttendanceClockPlainDetails {

    /**
     * 方案ID
     */
    private Integer planId;

    /**
     * 方案名称
     */
    private String planName;

    /**
     * 排班列表
     */
    private List<AttendanceClockSettingDetails> clockSettingDetails;


    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<AttendanceClockSettingDetails> getClockSettingDetails() {
        return clockSettingDetails;
    }

    public void setClockSettingDetails(List<AttendanceClockSettingDetails> clockSettingDetails) {
        this.clockSettingDetails = clockSettingDetails;
    }
}
