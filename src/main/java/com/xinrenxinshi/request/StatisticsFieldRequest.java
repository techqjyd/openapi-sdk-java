package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.StatDashboardInfo;
import com.xinrenxinshi.domain.statistic.StatisticsFieldDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhaopc
 * @Date 2024/12/11
 * @Version 1.0.0
 * @Description
 */
public class StatisticsFieldRequest  extends AbstractOpenapiJsonRequest<List<StatisticsFieldDO>> {

    /**
     * 分析类型 可选项 10000:员工 10006:部门
     */
    private Integer analyseType;

    public Integer getAnalyseType() {
        return analyseType;
    }

    public void setAnalyseType(Integer analyseType) {
        this.analyseType = analyseType;
    }

    public StatisticsFieldRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("analyseType", analyseType);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<StatisticsFieldDO>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<StatisticsFieldDO>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<StatisticsFieldDO>>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (analyseType == null) {
            throw new ParamNotValidException("分析类型请求参数为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/report/data/fields";
    }
}
