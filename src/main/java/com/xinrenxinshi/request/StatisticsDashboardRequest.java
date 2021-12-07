package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.StatDashboardInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author panhuiwen
 * @Date 2021/10/22 14:41
 */
public class StatisticsDashboardRequest extends AbstractOpenapiJsonRequest<List<StatDashboardInfo>> {

    public StatisticsDashboardRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return new HashMap<>();
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<StatDashboardInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<StatDashboardInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<StatDashboardInfo>>>() {};
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/dashboard/list";
    }
}
