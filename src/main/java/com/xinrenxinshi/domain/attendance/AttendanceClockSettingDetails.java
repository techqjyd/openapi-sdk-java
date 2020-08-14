package com.xinrenxinshi.domain.attendance;

import java.util.List;

/**
 * 当前描述：排班列表
 *
 * @author: jiazijie
 * @since: 2020/8/13 下午6:45
 */
public class AttendanceClockSettingDetails {

    /**
     * 班次ID
     */
    private Integer id;

    /**
     * 方案ID
     */
    private Integer attendancePlanId;

    /**
     * 班次名称
     */
    private String name;

    /**
     * 打卡开始时间，格式：HH:mm
     */
    private String startingTime;

    /**
     * 打卡结束时间，格式：HH:mm
     */
    private String closingTime;

    /**
     * 午休开始时间，格式：HH:mm
     */
    private String restStartTime;

    /**
     * 午休结束时间，格式：HH:mm
     */
    private String restEndTime;

    /**
     * 豁免开关
     */
    private boolean released;

    /**
     * 豁免时间，单位：分钟
     */
    private Integer releasedTime;

    /**
     * 弹性开关
     */
    private boolean flex;

    /**
     * 弹性时间，单位：分钟
     */
    private Integer flexTime;

    /**
     * 打卡方式，0:不打卡，1:一天两卡，2:一天4卡
     */
    private Integer isClocking;

    /**
     * 排班打卡信息列表
     */
    private List<AttendanceClockTimeRanges> clockTimeRanges;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttendancePlanId() {
        return attendancePlanId;
    }

    public void setAttendancePlanId(Integer attendancePlanId) {
        this.attendancePlanId = attendancePlanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getRestStartTime() {
        return restStartTime;
    }

    public void setRestStartTime(String restStartTime) {
        this.restStartTime = restStartTime;
    }

    public String getRestEndTime() {
        return restEndTime;
    }

    public void setRestEndTime(String restEndTime) {
        this.restEndTime = restEndTime;
    }

    public boolean isReleased() {
        return released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public Integer getReleasedTime() {
        return releasedTime;
    }

    public void setReleasedTime(Integer releasedTime) {
        this.releasedTime = releasedTime;
    }

    public boolean isFlex() {
        return flex;
    }

    public void setFlex(boolean flex) {
        this.flex = flex;
    }

    public Integer getFlexTime() {
        return flexTime;
    }

    public void setFlexTime(Integer flexTime) {
        this.flexTime = flexTime;
    }

    public Integer getIsClocking() {
        return isClocking;
    }

    public void setIsClocking(Integer isClocking) {
        this.isClocking = isClocking;
    }

    public List<AttendanceClockTimeRanges> getClockTimeRanges() {
        return clockTimeRanges;
    }

    public void setClockTimeRanges(List<AttendanceClockTimeRanges> clockTimeRanges) {
        this.clockTimeRanges = clockTimeRanges;
    }
}
