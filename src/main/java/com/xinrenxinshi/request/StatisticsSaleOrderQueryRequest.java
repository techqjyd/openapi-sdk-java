package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.ClueInfoDO;
import com.xinrenxinshi.domain.statistic.SaleOrderDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单列表查询请求
 */
public class StatisticsSaleOrderQueryRequest extends AbstractOpenapiJsonRequest<PageResult<SaleOrderDO>> {

    /**
     * 起始页从0开始
     */
    private Integer pageNo;

    /**
     * 每页数量 最大1000
     */
    private Integer pageSize;

    public StatisticsSaleOrderQueryRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<SaleOrderDO>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<SaleOrderDO>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<SaleOrderDO>>>() {};
    }


    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/performance/order/list";
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
