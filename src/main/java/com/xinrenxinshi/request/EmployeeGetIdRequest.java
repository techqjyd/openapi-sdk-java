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

    private List<String> emails;

    private List<String> mobiles;

    private List<String> jobNumbers;

    /**
     * 参数类型
     */
    private String type;

    /**
     * 员工状态
     */
    private Integer status;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public List<String> getJobNumbers() {
        return jobNumbers;
    }

    public void setJobNumbers(List<String> jobNumbers) {
        this.jobNumbers = jobNumbers;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(3);
        map.put("emails",emails);
        map.put("mobiles",mobiles);
        map.put("jobNumbers",jobNumbers);
        map.put("type",type);
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
