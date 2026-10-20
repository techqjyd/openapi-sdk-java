package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.recruit.RecruitmentStandardInfoDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhaopc
 * @Date 2025/8/11
 * @Version 1.0.0
 * @Description
 */
public class RecruitmentStandardResumeRequest  extends AbstractOpenapiJsonRequest<RecruitmentStandardInfoDO> {

    /**
     * 简历id
     */
    private String resumeId;


    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public RecruitmentStandardResumeRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("resumeId", resumeId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<RecruitmentStandardInfoDO> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<RecruitmentStandardInfoDO>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<RecruitmentStandardInfoDO>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(resumeId)) {
            throw new ParamNotValidException("简历id不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/resume/detail";
    }
}
