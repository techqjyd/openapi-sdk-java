package com.xinrenxinshi;

import com.xinrenxinshi.domain.statistic.StatChartDetailInfo;
import com.xinrenxinshi.domain.statistic.StatChartInfo;
import com.xinrenxinshi.domain.statistic.StatDashboardInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.StatisticsChartDetailRequest;
import com.xinrenxinshi.request.StatisticsChartRequest;
import com.xinrenxinshi.request.StatisticsDashboardRequest;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

/**
 * @Author panhuiwen
 * @Date 2021/10/22 14:34
 */
public abstract class XrxsStatisticService {

    public static OpenapiResponse<List<StatDashboardInfo>> getStatDashboardList(StatisticsDashboardRequest request) throws ApiException {
        OpenapiResponse<List<StatDashboardInfo>> execute = RequestTemplate.execute(request);
        return execute;
    }

    public static OpenapiResponse<List<StatChartInfo>> getStatChartList(StatisticsChartRequest request) throws ApiException {
        OpenapiResponse<List<StatChartInfo>> execute = RequestTemplate.execute(request);
        return execute;
    }

    public static OpenapiResponse<StatChartDetailInfo> getStatChartData(StatisticsChartDetailRequest request) throws ApiException {
        OpenapiResponse<StatChartDetailInfo> execute = RequestTemplate.execute(request);
        return execute;
    }

}
