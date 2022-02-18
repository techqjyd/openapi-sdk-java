package com.xinrenxinshi.domain.attendance;

/**
 * 考勤位置结果
 * @Author panhuiwen
 * @Date 2021/12/27 18:39
 */
public class AttendancePlaceInfo {
    private String location;
    /**
     * 经纬度
     */
    private Double latitude;
    private Double longitude;
    /**
     * 考勤范围距离
     */
    private Integer distance;

    /**
     * wifi名称
     */
    private String wifiName;
    /**
     * mac地址
     */
    private String macAddr;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }
}
