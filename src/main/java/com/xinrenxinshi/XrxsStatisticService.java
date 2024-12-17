package com.xinrenxinshi;

import com.xinrenxinshi.domain.statistic.*;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.PageResult;
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

    /**
     * 获取线索列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<PageResult<ClueInfoDO>> getClueInfoList(StatisticsClubInfoQueryRequest request) throws ApiException {
        OpenapiResponse<PageResult<ClueInfoDO>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 添加线索列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<Integer> addClueInfoList(StatisticsClubInfoAddRequest request) throws ApiException {
        OpenapiResponse<Integer> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 删除线索列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<Integer> deleteClueInfoList(StatisticsClubInfoDeleteRequest request) throws ApiException {
        OpenapiResponse<Integer> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取订单列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<PageResult<SaleOrderDO>> getSaleOrderList(StatisticsSaleOrderQueryRequest request) throws ApiException {
        OpenapiResponse<PageResult<SaleOrderDO>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 添加订单列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<Integer> addSaleOrderList(StatisticsSaleOrderAddRequest request) throws ApiException {
        OpenapiResponse<Integer> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 删除订单列表
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<Integer> deleteSaleOrderList(StatisticsSaleOrderDeleteRequest request) throws ApiException {
        OpenapiResponse<Integer> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取导入报表字段
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<List<StatisticsFieldDO>> getStatisticsFieldList(StatisticsFieldRequest request) throws ApiException {
        OpenapiResponse<List<StatisticsFieldDO>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 导入报表数据
     * @param request
     * @return
     * @throws ApiException
     */
    public static  OpenapiResponse<StatReportUploadResultDO> importStatisticsReport(StatisticsReportImportRequest request) throws ApiException {
        OpenapiResponse<StatReportUploadResultDO> execute = RequestTemplate.execute(request);
        return execute;
    }


}
