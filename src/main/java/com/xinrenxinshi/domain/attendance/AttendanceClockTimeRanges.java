package com.xinrenxinshi.domain.attendance;

import java.util.List;

/**
 * 当前描述：排班打卡信息列表
 *
 * @author: jiazijie
 * @since: 2020/8/13 下午6:48
 */
public class AttendanceClockTimeRanges {
    /**
     * 时间段序号
     */
    private Integer seqId;
    /**
     * 开始打卡时间，格式：HH:mm
     */
    private String startingTime;

    /**
     * 结束打卡时间，格式：HH:mm
     */
    private String closingTime;

    /**
     * 开始最早打卡时间，格式：HH:mm
     */
    private String clockStartTime;

    /**
     * 打卡最晚时间，格式：HH:mm
     */
    private String clockEndTime;
    /**
     * 上班卡开始时间的所属日期 -1: 前一天 0:当天 1:次日
     */
    private Integer clockStartEarliestBelong;
    /**
     * 上班卡开始时间
     */
    private String clockStartEarliestTime;
    /**
     * 上班卡结束时间的所属日期 -1: 前一天 0:当天 1:次日
     */
    private Integer clockStartLatestBelong;
    /**
     * 上班卡结束时间
     */
    private String clockStartLatestTime;
    /**
     * 下班卡开始时间的所属日期 -1: 前一天 0:当天 1:次日
     */
    private Integer clockEndEarliestBelong;
    /**
     * 下班卡开始时间
     */
    private String clockEndEarliestTime;
    /**
     * 下班卡结束时间的所属日期 -1: 前一天 0:当天 1:次日
     */
    private Integer clockEndLatestBelong;
    /**
     * 下班卡结束时间
     */
    private String clockEndLatestTime;
    /**
     * 上班豁免是否开启 0-否 1-是
     */
    private Integer clockStartExempt;

    /**
     * 上班豁免时间（分钟）
     */
    private Integer clockStartExemptTime;
    /**
     * 下班豁免开关 0-关闭 1-开启
     */
    private Integer clockEndExempt;
    /**
     * 下班豁免时间（分钟）
     */
    private Integer clockEndExemptTime;

    public Integer getClockStartExempt() {
        return clockStartExempt;
    }

    public void setClockStartExempt(Integer clockStartExempt) {
        this.clockStartExempt = clockStartExempt;
    }

    public Integer getClockStartExemptTime() {
        return clockStartExemptTime;
    }

    public void setClockStartExemptTime(Integer clockStartExemptTime) {
        this.clockStartExemptTime = clockStartExemptTime;
    }

    public Integer getClockEndExempt() {
        return clockEndExempt;
    }

    public void setClockEndExempt(Integer clockEndExempt) {
        this.clockEndExempt = clockEndExempt;
    }

    public Integer getClockEndExemptTime() {
        return clockEndExemptTime;
    }

    public void setClockEndExemptTime(Integer clockEndExemptTime) {
        this.clockEndExemptTime = clockEndExemptTime;
    }

    public Integer getClockStartEarliestBelong() {
        return clockStartEarliestBelong;
    }

    public void setClockStartEarliestBelong(Integer clockStartEarliestBelong) {
        this.clockStartEarliestBelong = clockStartEarliestBelong;
    }

    public String getClockStartEarliestTime() {
        return clockStartEarliestTime;
    }

    public void setClockStartEarliestTime(String clockStartEarliestTime) {
        this.clockStartEarliestTime = clockStartEarliestTime;
    }

    public Integer getClockStartLatestBelong() {
        return clockStartLatestBelong;
    }

    public void setClockStartLatestBelong(Integer clockStartLatestBelong) {
        this.clockStartLatestBelong = clockStartLatestBelong;
    }

    public String getClockStartLatestTime() {
        return clockStartLatestTime;
    }

    public void setClockStartLatestTime(String clockStartLatestTime) {
        this.clockStartLatestTime = clockStartLatestTime;
    }

    public Integer getClockEndLatestBelong() {
        return clockEndLatestBelong;
    }

    public void setClockEndLatestBelong(Integer clockEndLatestBelong) {
        this.clockEndLatestBelong = clockEndLatestBelong;
    }

    public String getClockEndLatestTime() {
        return clockEndLatestTime;
    }

    public void setClockEndLatestTime(String clockEndLatestTime) {
        this.clockEndLatestTime = clockEndLatestTime;
    }

    public Integer getClockEndEarliestBelong() {
        return clockEndEarliestBelong;
    }

    public void setClockEndEarliestBelong(Integer clockEndEarliestBelong) {
        this.clockEndEarliestBelong = clockEndEarliestBelong;
    }

    public String getClockEndEarliestTime() {
        return clockEndEarliestTime;
    }

    public void setClockEndEarliestTime(String clockEndEarliestTime) {
        this.clockEndEarliestTime = clockEndEarliestTime;
    }

    private List<AttendanceRestTimeRange>  restTimeRangs;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
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

    public String getClockStartTime() {
        return clockStartTime;
    }

    public void setClockStartTime(String clockStartTime) {
        this.clockStartTime = clockStartTime;
    }

    public String getClockEndTime() {
        return clockEndTime;
    }

    public void setClockEndTime(String clockEndTime) {
        this.clockEndTime = clockEndTime;
    }

    public List<AttendanceRestTimeRange> getRestTimeRangs() {
        return restTimeRangs;
    }

    public void setRestTimeRangs(List<AttendanceRestTimeRange> restTimeRangs) {
        this.restTimeRangs = restTimeRangs;
    }
}
