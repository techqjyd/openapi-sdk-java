package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.CostCenterModel;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取成本中心信息请求
 *
 * @author Ke Zhan on 2020/11/19
 */
public class CostCenterModelRequest extends AbstractOpenapiJsonRequest<List<CostCenterModel>> {

    /**
     * 成本中心id，不传时，默认返回公司所有成本中心信息
     */
    private String costId;

    public CostCenterModelRequest(String accessToken) {
        super(accessToken);
    }

    public java.lang.String getCostId() {
        return costId;
    }

    public void setCostId(java.lang.String costId) {
        this.costId = costId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("costId", costId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<CostCenterModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        // ignore check
    }

    @Override
    public TypeReference<OpenapiResponse<List<CostCenterModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<CostCenterModel>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/costcenter/list";
    }
}
