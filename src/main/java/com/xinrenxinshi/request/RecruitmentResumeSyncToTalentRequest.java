package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeStandardFieldInfo;
import com.xinrenxinshi.domain.recruit.RecruitmentResumeUploadParam;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentResumeSyncToTalentRequest
 * @date : 2023/5/8 13:44
 */
public class RecruitmentResumeSyncToTalentRequest extends AbstractOpenapiJsonRequest<String> {

    /**
     * 简历上传参数
     */
    private RecruitmentResumeUploadParam uploadParam;

    /**
     * 标准简历信息
     */
    private RecruitmentResumeStandardFieldInfo standardResume;

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String,Object> map = new HashMap<>(10);
        map.put("uploadParam",uploadParam);
        map.put("standardResume",standardResume);
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
        return new TypeReference<OpenapiResponse<String>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (uploadParam == null){
            throw new ParamNotValidException("简历上传参数不能为空");
        }
        if (standardResume == null){
            throw new ParamNotValidException("简历上传字段不能为空");
        }
    }

    public RecruitmentResumeSyncToTalentRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/resume/addToTalent";
    }

    public RecruitmentResumeUploadParam getUploadParam() {
        return uploadParam;
    }

    public void setUploadParam(RecruitmentResumeUploadParam uploadParam) {
        this.uploadParam = uploadParam;
    }

    public RecruitmentResumeStandardFieldInfo getStandardResume() {
        return standardResume;
    }

    public void setStandardResume(RecruitmentResumeStandardFieldInfo standardResume) {
        this.standardResume = standardResume;
    }
}
