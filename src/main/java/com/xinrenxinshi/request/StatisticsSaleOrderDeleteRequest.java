package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 批量删除订单请求
 */
public class StatisticsSaleOrderDeleteRequest extends AbstractOpenapiJsonRequest<Integer> {

    /**
     * 订单id
     */
    private List<Long> saleOrderIdList;

    public StatisticsSaleOrderDeleteRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("saleOrderIdList", saleOrderIdList);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Integer> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Integer>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Integer>>() {};
    }


    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/performance/order/delete";
    }

    public List<Long> getSaleOrderIdList() {
        return saleOrderIdList;
    }

    public void setSaleOrderIdList(List<Long> saleOrderIdList) {
        this.saleOrderIdList = saleOrderIdList;
    }
}
