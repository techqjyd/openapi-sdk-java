package com.xinrenxinshi.domain.attendance;

import java.io.Serializable;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : AttendanceDailyReportResult
 * @date : 2024/7/23 14:26
 */
public class AttendanceDailyReportResult implements Serializable {

    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 员工姓名
     */
    private String employeeName;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 每日应出勤时长
     */
    private Double shouldworkhour;
    /**
     * 每日实际出勤时长
     */
    private Double realondutyhour;
    /**
     * 首次打卡时间
     */
    private String clockon;
    /**
     * 末次打卡时间
     */
    private String clockout;
    /**
     * 迟到次数
     */
    private Integer latenum;
    /**
     * 早退次数
     */
    private Integer earlynum;
    /**
     * 缺卡次数
     */
    private Integer lacknumsum;
    /**
     * 有效补卡次数
     */
    private Integer vbdknum;
    /**
     * 日期类型
     */
    private String dtype;
    /**
     * 日期
     */
    private String operateDate;
    /**
     * 班次名称
     */
    private String shiftsName;
    /**
     * 方案标签
     */
    private String costLabel;
    /**
     * 打卡时长
     */
    private Double clockHour;
    /**
     * 工作日时长
     */
    private Double realWorkHour;
    /**
     *休息时长
     */
    private Double restHour;
    /**
     *迟到分钟
     */
    private Double lateMinute;
    /**
     * 早退分钟
     */
    private Double earlyMinute;
    /**
     * 旷工(小时)
     */
    private Double absent;
    /**
     * 漏卡次数-指当前报表的【缺卡次数】
     */
    private Integer lackClockNum;
    /**
     * 补卡次数
     */
    private Integer bdkNum;
    /**
     * 上班缺卡数（新）
     */
    private Integer lackNumOn;
    /**
     * 下班缺卡数（新）
     */
    private Integer lackNumOff;
    /**
     * 缺卡次数（新）
     */
    private Integer lackNumSum;
    /**
     * 加班时长(无补偿)
     */
    private Double onocHour;
    /**
     * 加班时长(加班费)
     */
    private Double opayHour;
    /**
     * 加班时长(调休)
     */
    private Double orestHour;
    /**
     * 加班总时长
     */
    private Double oHour;
    /**
     * 外勤（天）
     */
    private Double outWork;
    /**
     * 外勤（小时）
     */
    private Double outWorkHour;
    /**
     * 外出(天)
     */
    private Double outh;
    /**
     * 外出（小时）
     */
    private Double out;
    /**
     * 出差(天)
     */
    private Double trip;
    /**
     *出差（小时）
     */
    private Double tripHour;
    /**
     * 居家办公（天）
     */
    private Double homeWork;
    /**
     * 居家办公（小时）
     */
    private Double homeWorkHour;
    /**
     * 年假(天)
     */
    private Double holidayTypeOneDay;
    /**
     * 年假(小时)
     */
    private Double holidayTypeOneHour;
    /**
     * 事假(天)
     */
    private Double holidayTypeTwoDay;
    /**
     * 事假(小时)
     */
    private Double holidayTypeTwoHour;
    /**
     * 病假(天)
     */
    private Double holidayTypeThreeDay;
    /**
     * 病假(小时)
     */
    private Double holidayTypeThreeHour;
    /**
     * 婚假(天)
     */
    private Double holidayTypeFourDay;
    /**
     * 婚假(小时)
     */
    private Double holidayTypeFourHour;
    /**
     * 丧假(天)
     */
    private Double holidayTypeFiveDay;
    /**
     * 丧假(小时)
     */
    private Double holidayTypeFiveHour;
    /**
     * 产假(天)
     */
    private Double holidayTypeSixDay;
    /**
     * 产假(小时)
     */
    private Double holidayTypeSixHour;
    /**
     * 奖励产假(天)
     */
    private Double holidayTypeSevenDay;
    /**
     * 奖励产假(小时)
     */
    private Double holidayTypeSevenHour;
    /**
     * 陪产假(天)
     */
    private Double holidayTypeEightDay;
    /**
     * 陪产假(小时)
     */
    private Double holidayTypeEightHour;
    /**
     *探亲假(天)
     */
    private Double holidayTypeNineDay;
    /**
     * 探亲假(小时)
     */
    private Double holidayTypeNineHour;
    /**
     * 工伤假(天)
     */
    private Double holidayTypeTenDay;
    /**
     * 工伤假(小时)
     */
    private Double holidayTypeTenHour;
    /**
     * 调休(天)
     */
    private Double holidayTypeElevenDay;
    /**
     * 调休(小时)
     */
    private Double holidayTypeElevenHour;
    /**
     * 产检假(天)
     */
    private Double holidayTypeTwelveDay;
    /**
     *产检假(小时)
     */
    private Double holidayTypeTwelveHour;
    /**
     * 流产假(天)
     */
    private Double holidayTypeThirteenDay;
    /**
     * 流产假(小时)
     */
    private Double holidayTypeThirteenHour;
    /**
     * 哺乳假(天)
     */
    private Double holidayTypeFortyDay;
    /**
     * 哺乳假(小时)
     */
    private Double holidayTypeFortyHour;
    /**
     * 长期病假(天)
     */
    private Double holidayTypeNnDay;
    /**
     * 长期病假(小时)
     */
    private Double holidayTypeNnHour;
    /**
     * 请假总时长(小时)
     */
    private String holidayHourSum;
    /**
     * 请假总时长(天)
     */
    private String holidaySum;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Double getShouldworkhour() {
        return shouldworkhour;
    }

    public void setShouldworkhour(Double shouldworkhour) {
        this.shouldworkhour = shouldworkhour;
    }

    public Double getRealondutyhour() {
        return realondutyhour;
    }

    public void setRealondutyhour(Double realondutyhour) {
        this.realondutyhour = realondutyhour;
    }

    public String getClockon() {
        return clockon;
    }

    public void setClockon(String clockon) {
        this.clockon = clockon;
    }

    public String getClockout() {
        return clockout;
    }

    public void setClockout(String clockout) {
        this.clockout = clockout;
    }

    public Integer getLatenum() {
        return latenum;
    }

    public void setLatenum(Integer latenum) {
        this.latenum = latenum;
    }

    public Integer getEarlynum() {
        return earlynum;
    }

    public void setEarlynum(Integer earlynum) {
        this.earlynum = earlynum;
    }

    public Integer getLacknumsum() {
        return lacknumsum;
    }

    public void setLacknumsum(Integer lacknumsum) {
        this.lacknumsum = lacknumsum;
    }

    public Integer getVbdknum() {
        return vbdknum;
    }

    public void setVbdknum(Integer vbdknum) {
        this.vbdknum = vbdknum;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getShiftsName() {
        return shiftsName;
    }

    public void setShiftsName(String shiftsName) {
        this.shiftsName = shiftsName;
    }

    public String getCostLabel() {
        return costLabel;
    }

    public void setCostLabel(String costLabel) {
        this.costLabel = costLabel;
    }

    public Double getClockHour() {
        return clockHour;
    }

    public void setClockHour(Double clockHour) {
        this.clockHour = clockHour;
    }

    public Double getRealWorkHour() {
        return realWorkHour;
    }

    public void setRealWorkHour(Double realWorkHour) {
        this.realWorkHour = realWorkHour;
    }

    public Double getRestHour() {
        return restHour;
    }

    public void setRestHour(Double restHour) {
        this.restHour = restHour;
    }

    public Double getLateMinute() {
        return lateMinute;
    }

    public void setLateMinute(Double lateMinute) {
        this.lateMinute = lateMinute;
    }

    public Double getEarlyMinute() {
        return earlyMinute;
    }

    public void setEarlyMinute(Double earlyMinute) {
        this.earlyMinute = earlyMinute;
    }

    public Double getAbsent() {
        return absent;
    }

    public void setAbsent(Double absent) {
        this.absent = absent;
    }

    public Integer getLackClockNum() {
        return lackClockNum;
    }

    public void setLackClockNum(Integer lackClockNum) {
        this.lackClockNum = lackClockNum;
    }

    public Integer getBdkNum() {
        return bdkNum;
    }

    public void setBdkNum(Integer bdkNum) {
        this.bdkNum = bdkNum;
    }

    public Integer getLackNumOn() {
        return lackNumOn;
    }

    public void setLackNumOn(Integer lackNumOn) {
        this.lackNumOn = lackNumOn;
    }

    public Integer getLackNumOff() {
        return lackNumOff;
    }

    public void setLackNumOff(Integer lackNumOff) {
        this.lackNumOff = lackNumOff;
    }

    public Integer getLackNumSum() {
        return lackNumSum;
    }

    public void setLackNumSum(Integer lackNumSum) {
        this.lackNumSum = lackNumSum;
    }

    public Double getOnocHour() {
        return onocHour;
    }

    public void setOnocHour(Double onocHour) {
        this.onocHour = onocHour;
    }

    public Double getOpayHour() {
        return opayHour;
    }

    public void setOpayHour(Double opayHour) {
        this.opayHour = opayHour;
    }

    public Double getOrestHour() {
        return orestHour;
    }

    public void setOrestHour(Double orestHour) {
        this.orestHour = orestHour;
    }

    public Double getoHour() {
        return oHour;
    }

    public void setoHour(Double oHour) {
        this.oHour = oHour;
    }

    public Double getOutWork() {
        return outWork;
    }

    public void setOutWork(Double outWork) {
        this.outWork = outWork;
    }

    public Double getOutWorkHour() {
        return outWorkHour;
    }

    public void setOutWorkHour(Double outWorkHour) {
        this.outWorkHour = outWorkHour;
    }

    public Double getOuth() {
        return outh;
    }

    public void setOuth(Double outh) {
        this.outh = outh;
    }

    public Double getOut() {
        return out;
    }

    public void setOut(Double out) {
        this.out = out;
    }

    public Double getTrip() {
        return trip;
    }

    public void setTrip(Double trip) {
        this.trip = trip;
    }

    public Double getTripHour() {
        return tripHour;
    }

    public void setTripHour(Double tripHour) {
        this.tripHour = tripHour;
    }

    public Double getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(Double homeWork) {
        this.homeWork = homeWork;
    }

    public Double getHomeWorkHour() {
        return homeWorkHour;
    }

    public void setHomeWorkHour(Double homeWorkHour) {
        this.homeWorkHour = homeWorkHour;
    }

    public Double getHolidayTypeOneDay() {
        return holidayTypeOneDay;
    }

    public void setHolidayTypeOneDay(Double holidayTypeOneDay) {
        this.holidayTypeOneDay = holidayTypeOneDay;
    }

    public Double getHolidayTypeOneHour() {
        return holidayTypeOneHour;
    }

    public void setHolidayTypeOneHour(Double holidayTypeOneHour) {
        this.holidayTypeOneHour = holidayTypeOneHour;
    }

    public Double getHolidayTypeTwoDay() {
        return holidayTypeTwoDay;
    }

    public void setHolidayTypeTwoDay(Double holidayTypeTwoDay) {
        this.holidayTypeTwoDay = holidayTypeTwoDay;
    }

    public Double getHolidayTypeTwoHour() {
        return holidayTypeTwoHour;
    }

    public void setHolidayTypeTwoHour(Double holidayTypeTwoHour) {
        this.holidayTypeTwoHour = holidayTypeTwoHour;
    }

    public Double getHolidayTypeThreeDay() {
        return holidayTypeThreeDay;
    }

    public void setHolidayTypeThreeDay(Double holidayTypeThreeDay) {
        this.holidayTypeThreeDay = holidayTypeThreeDay;
    }

    public Double getHolidayTypeThreeHour() {
        return holidayTypeThreeHour;
    }

    public void setHolidayTypeThreeHour(Double holidayTypeThreeHour) {
        this.holidayTypeThreeHour = holidayTypeThreeHour;
    }

    public Double getHolidayTypeFourDay() {
        return holidayTypeFourDay;
    }

    public void setHolidayTypeFourDay(Double holidayTypeFourDay) {
        this.holidayTypeFourDay = holidayTypeFourDay;
    }

    public Double getHolidayTypeFourHour() {
        return holidayTypeFourHour;
    }

    public void setHolidayTypeFourHour(Double holidayTypeFourHour) {
        this.holidayTypeFourHour = holidayTypeFourHour;
    }

    public Double getHolidayTypeFiveDay() {
        return holidayTypeFiveDay;
    }

    public void setHolidayTypeFiveDay(Double holidayTypeFiveDay) {
        this.holidayTypeFiveDay = holidayTypeFiveDay;
    }

    public Double getHolidayTypeFiveHour() {
        return holidayTypeFiveHour;
    }

    public void setHolidayTypeFiveHour(Double holidayTypeFiveHour) {
        this.holidayTypeFiveHour = holidayTypeFiveHour;
    }

    public Double getHolidayTypeSixDay() {
        return holidayTypeSixDay;
    }

    public void setHolidayTypeSixDay(Double holidayTypeSixDay) {
        this.holidayTypeSixDay = holidayTypeSixDay;
    }

    public Double getHolidayTypeSixHour() {
        return holidayTypeSixHour;
    }

    public void setHolidayTypeSixHour(Double holidayTypeSixHour) {
        this.holidayTypeSixHour = holidayTypeSixHour;
    }

    public Double getHolidayTypeSevenDay() {
        return holidayTypeSevenDay;
    }

    public void setHolidayTypeSevenDay(Double holidayTypeSevenDay) {
        this.holidayTypeSevenDay = holidayTypeSevenDay;
    }

    public Double getHolidayTypeSevenHour() {
        return holidayTypeSevenHour;
    }

    public void setHolidayTypeSevenHour(Double holidayTypeSevenHour) {
        this.holidayTypeSevenHour = holidayTypeSevenHour;
    }

    public Double getHolidayTypeEightDay() {
        return holidayTypeEightDay;
    }

    public void setHolidayTypeEightDay(Double holidayTypeEightDay) {
        this.holidayTypeEightDay = holidayTypeEightDay;
    }

    public Double getHolidayTypeEightHour() {
        return holidayTypeEightHour;
    }

    public void setHolidayTypeEightHour(Double holidayTypeEightHour) {
        this.holidayTypeEightHour = holidayTypeEightHour;
    }

    public Double getHolidayTypeNineDay() {
        return holidayTypeNineDay;
    }

    public void setHolidayTypeNineDay(Double holidayTypeNineDay) {
        this.holidayTypeNineDay = holidayTypeNineDay;
    }

    public Double getHolidayTypeNineHour() {
        return holidayTypeNineHour;
    }

    public void setHolidayTypeNineHour(Double holidayTypeNineHour) {
        this.holidayTypeNineHour = holidayTypeNineHour;
    }

    public Double getHolidayTypeTenDay() {
        return holidayTypeTenDay;
    }

    public void setHolidayTypeTenDay(Double holidayTypeTenDay) {
        this.holidayTypeTenDay = holidayTypeTenDay;
    }

    public Double getHolidayTypeTenHour() {
        return holidayTypeTenHour;
    }

    public void setHolidayTypeTenHour(Double holidayTypeTenHour) {
        this.holidayTypeTenHour = holidayTypeTenHour;
    }

    public Double getHolidayTypeElevenDay() {
        return holidayTypeElevenDay;
    }

    public void setHolidayTypeElevenDay(Double holidayTypeElevenDay) {
        this.holidayTypeElevenDay = holidayTypeElevenDay;
    }

    public Double getHolidayTypeElevenHour() {
        return holidayTypeElevenHour;
    }

    public void setHolidayTypeElevenHour(Double holidayTypeElevenHour) {
        this.holidayTypeElevenHour = holidayTypeElevenHour;
    }

    public Double getHolidayTypeTwelveDay() {
        return holidayTypeTwelveDay;
    }

    public void setHolidayTypeTwelveDay(Double holidayTypeTwelveDay) {
        this.holidayTypeTwelveDay = holidayTypeTwelveDay;
    }

    public Double getHolidayTypeTwelveHour() {
        return holidayTypeTwelveHour;
    }

    public void setHolidayTypeTwelveHour(Double holidayTypeTwelveHour) {
        this.holidayTypeTwelveHour = holidayTypeTwelveHour;
    }

    public Double getHolidayTypeThirteenDay() {
        return holidayTypeThirteenDay;
    }

    public void setHolidayTypeThirteenDay(Double holidayTypeThirteenDay) {
        this.holidayTypeThirteenDay = holidayTypeThirteenDay;
    }

    public Double getHolidayTypeThirteenHour() {
        return holidayTypeThirteenHour;
    }

    public void setHolidayTypeThirteenHour(Double holidayTypeThirteenHour) {
        this.holidayTypeThirteenHour = holidayTypeThirteenHour;
    }

    public Double getHolidayTypeFortyDay() {
        return holidayTypeFortyDay;
    }

    public void setHolidayTypeFortyDay(Double holidayTypeFortyDay) {
        this.holidayTypeFortyDay = holidayTypeFortyDay;
    }

    public Double getHolidayTypeFortyHour() {
        return holidayTypeFortyHour;
    }

    public void setHolidayTypeFortyHour(Double holidayTypeFortyHour) {
        this.holidayTypeFortyHour = holidayTypeFortyHour;
    }

    public Double getHolidayTypeNnDay() {
        return holidayTypeNnDay;
    }

    public void setHolidayTypeNnDay(Double holidayTypeNnDay) {
        this.holidayTypeNnDay = holidayTypeNnDay;
    }

    public Double getHolidayTypeNnHour() {
        return holidayTypeNnHour;
    }

    public void setHolidayTypeNnHour(Double holidayTypeNnHour) {
        this.holidayTypeNnHour = holidayTypeNnHour;
    }

    public String getHolidayHourSum() {
        return holidayHourSum;
    }

    public void setHolidayHourSum(String holidayHourSum) {
        this.holidayHourSum = holidayHourSum;
    }

    public String getHolidaySum() {
        return holidaySum;
    }

    public void setHolidaySum(String holidaySum) {
        this.holidaySum = holidaySum;
    }
}
