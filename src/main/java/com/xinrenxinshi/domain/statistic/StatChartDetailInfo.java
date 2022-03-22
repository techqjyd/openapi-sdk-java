package com.xinrenxinshi.domain.statistic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author panhuiwen
 * @Date 2021/10/21 15:55
 */
public class StatChartDetailInfo {
    private Integer chartId;
    private Integer dashboardId;
    private String chartTitle;
    private Integer chartType;
    private List<String> chartDesc;
    private StatChartDataDO chartData = new StatChartDataDO();
    private List<List<String>> chartDataDetail = new ArrayList();

    public Integer getChartId() {
        return chartId;
    }

    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }

    public Integer getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(Integer dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getChartTitle() {
        return chartTitle;
    }

    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    public Integer getChartType() {
        return chartType;
    }

    public void setChartType(Integer chartType) {
        this.chartType = chartType;
    }

    public List<String> getChartDesc() {
        return chartDesc;
    }

    public void setChartDesc(List<String> chartDesc) {
        this.chartDesc = chartDesc;
    }

    public StatChartDataDO getChartData() {
        return chartData;
    }

    public void setChartData(StatChartDataDO chartData) {
        this.chartData = chartData;
    }

    public List<List<String>> getChartDataDetail() {
        return chartDataDetail;
    }

    public void setChartDataDetail(List<List<String>> chartDataDetail) {
        this.chartDataDetail = chartDataDetail;
    }
}
