package com.xinrenxinshi.response;

/**
 * <我的考勤 统计返回结果>.
 *
 * @author peng cheng
 * @date 2021/6/24
 * @since
 */
public class AttendanceStatisticsResponse{
    /**
     * 迟到次数
     */
    private double lateNum;

    /**
     * 早退次数
     */
    private double leaveEarlyNum;

    /**
     * 旷工次数
     */
    private double absentNum;

    /**
     * 外出请假次数
     */
    private double leaveOrOutNum;

    /**
     * 非工作日天数
     */
    private int noWorkdayNum;

    public double getLateNum() {
        return lateNum;
    }

    public void setLateNum(double lateNum) {
        this.lateNum = lateNum;
    }

    public double getLeaveEarlyNum() {
        return leaveEarlyNum;
    }

    public void setLeaveEarlyNum(double leaveEarlyNum) {
        this.leaveEarlyNum = leaveEarlyNum;
    }

    public double getAbsentNum() {
        return absentNum;
    }

    public void setAbsentNum(double absentNum) {
        this.absentNum = absentNum;
    }

    public double getLeaveOrOutNum() {
        return leaveOrOutNum;
    }

    public void setLeaveOrOutNum(double leaveOrOutNum) {
        this.leaveOrOutNum = leaveOrOutNum;
    }

    public int getNoWorkdayNum() {
        return noWorkdayNum;
    }

    public void setNoWorkdayNum(int noWorkdayNum) {
        this.noWorkdayNum = noWorkdayNum;
    }
}
