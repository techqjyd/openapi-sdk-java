package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.apprisal.ApprisalKpiTargetDetailModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApprisalKpiAccessCompleteValueRequest extends AbstractOpenapiJsonRequest<Void> {
    /**
     * 方案id
     */
    private String planId;
    /**
     * 被考核人id
     */
    private String assesseeEmpId;
    /**
     * 指标详情
     */
    private List<ApprisalKpiTargetDetailModel> targetDetailList;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getAssesseeEmpId() {
        return assesseeEmpId;
    }

    public void setAssesseeEmpId(String assesseeEmpId) {
        this.assesseeEmpId = assesseeEmpId;
    }

    public List<ApprisalKpiTargetDetailModel> getTargetDetailList() {
        return targetDetailList;
    }

    public void setTargetDetailList(List<ApprisalKpiTargetDetailModel> targetDetailList) {
        this.targetDetailList = targetDetailList;
    }

    public ApprisalKpiAccessCompleteValueRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("planId", planId);
        map.put("assesseeEmpId", assesseeEmpId);
        map.put("targetDetailList", targetDetailList);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/apprisal/kpi/complete/value";
    }
}
