package com.xinrenxinshi.domain.statistic;

/**
 * @Author panhuiwen
 * @Date 2021/10/21 15:46
 */
public class StatDashboardInfo {
    private Integer dashboardId;
    private String name;
    private String dashboardDesc;

    public Integer getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(Integer dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDashboardDesc() {
        return dashboardDesc;
    }

    public void setDashboardDesc(String dashboardDesc) {
        this.dashboardDesc = dashboardDesc;
    }
}
