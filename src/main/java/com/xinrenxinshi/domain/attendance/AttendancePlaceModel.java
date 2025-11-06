package com.xinrenxinshi.domain.attendance;

import java.io.Serializable;

/**
 * @author anson
 * @date 2019/9/5
 */
public class AttendancePlaceModel implements Serializable {
    private static final long serialVersionUID = 399730334331394647L;

    /**
     * 地点名称
     */
    private String location;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 有效范围
     */
    private Integer distance;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}