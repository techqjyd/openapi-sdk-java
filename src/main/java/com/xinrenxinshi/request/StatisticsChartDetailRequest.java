package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.StatChartDetailInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author panhuiwen
 * @Date 2021/10/22 14:41
 */
public class StatisticsChartDetailRequest extends AbstractOpenapiJsonRequest<StatChartDetailInfo> {

    private Integer chartId;
    private Integer dashboardId;
    private Integer dateFilterType;
    private String dateLeftValue;
    private String dateRightValue;

    public StatisticsChartDetailRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("chartId", chartId);
        map.put("dashboardId", dashboardId);
        map.put("dateFilterType", dateFilterType);
        map.put("dateLeftValue", dateLeftValue);
        map.put("dateRightValue", dateRightValue);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<StatChartDetailInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<StatChartDetailInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<StatChartDetailInfo>>() {};
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/chart/data";
    }

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

    public Integer getDateFilterType() {
        return dateFilterType;
    }

    public void setDateFilterType(Integer dateFilterType) {
        this.dateFilterType = dateFilterType;
    }

    public String getDateLeftValue() {
        return dateLeftValue;
    }

    public void setDateLeftValue(String dateLeftValue) {
        this.dateLeftValue = dateLeftValue;
    }

    public String getDateRightValue() {
        return dateRightValue;
    }

    public void setDateRightValue(String dateRightValue) {
        this.dateRightValue = dateRightValue;
    }
}
