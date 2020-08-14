package com.xinrenxinshi.domain.attendance;

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
}
