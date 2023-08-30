package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.recruit.TalentBankInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentTalentBankListRequest
 * @date : 2023/5/8 13:39
 */
public class RecruitmentTalentBankListRequest extends AbstractOpenapiJsonRequest<List<TalentBankInfo>> {


    public RecruitmentTalentBankListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return  MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<TalentBankInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<TalentBankInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<TalentBankInfo>>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/talentbank/list";
    }
}
