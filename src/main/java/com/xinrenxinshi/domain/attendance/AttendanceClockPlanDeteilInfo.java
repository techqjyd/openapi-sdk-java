package com.xinrenxinshi.domain.attendance;

import java.util.List;

/**
 * 打卡方案详情
 * @Author hzz
 * @Date 2022/02/08
 */
public class AttendanceClockPlanDeteilInfo {
    private Integer clockPlanId;
    private String clockPlanName;
    private List<AttendancePlaceInfo> wifiList;
    private List<AttendancePlaceInfo> placeList;

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

    public List<AttendancePlaceInfo> getWifiList() {
        return wifiList;
    }

    public void setWifiList(List<AttendancePlaceInfo> wifiList) {
        this.wifiList = wifiList;
    }

    public List<AttendancePlaceInfo> getPlaceList() {
        return placeList;
    }

    public void setPlaceList(List<AttendancePlaceInfo> placeList) {
        this.placeList = placeList;
    }
}
