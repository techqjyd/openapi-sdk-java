package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeParamModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 招聘添加简历request
 *
 * @author: hzz
 * @create: 2022-01-14
 **/
public class RecruitmentSyncResumeRequest extends AbstractOpenapiJsonRequest<String> {

    private RecruitmentResumeParamModel paramModel;


    public RecruitmentSyncResumeRequest(String accessToken){
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String,Object> map = new HashMap<>(10);
        map.put("paramModel",paramModel);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/addRecruitmentResume";
    }

    public RecruitmentResumeParamModel getParamModel() {
        return paramModel;
    }

    public void setParamModel(RecruitmentResumeParamModel paramModel) {
        this.paramModel = paramModel;
    }
}
