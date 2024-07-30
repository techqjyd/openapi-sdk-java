package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.ClueInfoDO;
import com.xinrenxinshi.domain.statistic.SaleOrderDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *批量添加订单
 */
public class StatisticsSaleOrderAddRequest extends AbstractOpenapiJsonRequest<Integer> {

    /**
     * 订单列表
     */
    List<SaleOrderDO> saleOrderDOList;

    public StatisticsSaleOrderAddRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("saleOrderDOList", saleOrderDOList);
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
        return "/v5/statistic/performance/order/add";
    }

    public List<SaleOrderDO> getSaleOrderDOList() {
        return saleOrderDOList;
    }

    public void setSaleOrderDOList(List<SaleOrderDO> saleOrderDOList) {
        this.saleOrderDOList = saleOrderDOList;
    }
}
