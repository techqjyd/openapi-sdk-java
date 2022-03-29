package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeGetIdRequest extends AbstractOpenapiJsonRequest<Map<String,String>> {

    public EmployeeGetIdRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 参数列表
     */
    private List<String> paramList;

    /**
     * 参数类型
     */
    private String paramType;

    /**
     * 员工状态
     */
    private Integer status;

    public List<String> getParamList() {
        return paramList;
    }

    public void setParamList(List<String> paramList) {
        this.paramList = paramList;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(3);
        map.put("paramList",paramList);
        map.put("paramType",paramType);
        map.put("status",status);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Map<String, String>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Map<String, String>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Map<String, String>>>(){
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/getId";
    }
}
