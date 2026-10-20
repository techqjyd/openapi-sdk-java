package com.xinrenxinshi.domain.approval;

import java.util.List;
import java.util.Map;

public class EmployeeOvertimeRuleResult {
    private String overtimePlanId;
    private List<String> workTypes;
    private Integer compensationWayHideSwitch;
    private String overtimeHour;
    private String overtimeDay;
    private Integer num;
    private String overtimeTotalHour;
    private Map<Integer, Object> checkMsg;
    private Integer compensationRule;
    private Integer calculationRule;
    private int overtimeSplittingStandard;
    private Integer isNeedNoChooseOvertimeRange;
    private String startDate;
    private String endDate;
    private Integer attendanceDate;
    private List<AttendanceTimeRangeInfo> relaxtimeList;
    private List<TimeRange> timeRanges;
    private Map<String, List<EmployeeOvertimeDateDO>> overtimeDateMap;
    private String workTypeSingle;

    public String getOvertimePlanId() {
        return overtimePlanId;
    }

    public void setOvertimePlanId(String overtimePlanId) {
        this.overtimePlanId = overtimePlanId;
    }

    public List<String> getWorkTypes() {
        return workTypes;
    }

    public void setWorkTypes(List<String> workTypes) {
        this.workTypes = workTypes;
    }

    public Integer getCompensationWayHideSwitch() {
        return compensationWayHideSwitch;
    }

    public void setCompensationWayHideSwitch(Integer compensationWayHideSwitch) {
        this.compensationWayHideSwitch = compensationWayHideSwitch;
    }

    public String getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(String overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    public String getOvertimeDay() {
        return overtimeDay;
    }

    public void setOvertimeDay(String overtimeDay) {
        this.overtimeDay = overtimeDay;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOvertimeTotalHour() {
        return overtimeTotalHour;
    }

    public void setOvertimeTotalHour(String overtimeTotalHour) {
        this.overtimeTotalHour = overtimeTotalHour;
    }

    public Map<Integer, Object> getCheckMsg() {
        return checkMsg;
    }

    public void setCheckMsg(Map<Integer, Object> checkMsg) {
        this.checkMsg = checkMsg;
    }

    public Integer getCompensationRule() {
        return compensationRule;
    }

    public void setCompensationRule(Integer compensationRule) {
        this.compensationRule = compensationRule;
    }

    public Integer getCalculationRule() {
        return calculationRule;
    }

    public void setCalculationRule(Integer calculationRule) {
        this.calculationRule = calculationRule;
    }

    public int getOvertimeSplittingStandard() {
        return overtimeSplittingStandard;
    }

    public void setOvertimeSplittingStandard(int overtimeSplittingStandard) {
        this.overtimeSplittingStandard = overtimeSplittingStandard;
    }

    public Integer getIsNeedNoChooseOvertimeRange() {
        return isNeedNoChooseOvertimeRange;
    }

    public void setIsNeedNoChooseOvertimeRange(Integer isNeedNoChooseOvertimeRange) {
        this.isNeedNoChooseOvertimeRange = isNeedNoChooseOvertimeRange;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Integer attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public List<AttendanceTimeRangeInfo> getRelaxtimeList() {
        return relaxtimeList;
    }

    public void setRelaxtimeList(List<AttendanceTimeRangeInfo> relaxtimeList) {
        this.relaxtimeList = relaxtimeList;
    }

    public List<TimeRange> getTimeRanges() {
        return timeRanges;
    }

    public void setTimeRanges(List<TimeRange> timeRanges) {
        this.timeRanges = timeRanges;
    }

    public Map<String, List<EmployeeOvertimeDateDO>> getOvertimeDateMap() {
        return overtimeDateMap;
    }

    public void setOvertimeDateMap(Map<String, List<EmployeeOvertimeDateDO>> overtimeDateMap) {
        this.overtimeDateMap = overtimeDateMap;
    }

    public String getWorkTypeSingle() {
        return workTypeSingle;
    }

    public void setWorkTypeSingle(String workTypeSingle) {
        this.workTypeSingle = workTypeSingle;
    }
}