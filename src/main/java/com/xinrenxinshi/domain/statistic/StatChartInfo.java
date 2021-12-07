package com.xinrenxinshi.domain.statistic;

/**
 * @Author panhuiwen
 * @Date 2021/10/21 15:53
 */
public class StatChartInfo {
    private Integer chartId;
    private String chartTitle;
    private Integer dashboardId;
    private String chartDesc;
    private Integer chartType;

    public Integer getChartId() {
        return chartId;
    }

    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }

    public String getChartTitle() {
        return chartTitle;
    }

    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    public Integer getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(Integer dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getChartDesc() {
        return chartDesc;
    }

    public void setChartDesc(String chartDesc) {
        this.chartDesc = chartDesc;
    }

    public Integer getChartType() {
        return chartType;
    }

    public void setChartType(Integer chartType) {
        this.chartType = chartType;
    }
}
