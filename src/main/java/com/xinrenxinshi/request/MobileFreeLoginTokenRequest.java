package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.FreeLoginToken;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取免登token reqest
 *
 * @author: liuchenhui
 * @create: 2019-11-06 18:17
 **/
public class MobileFreeLoginTokenRequest extends AbstractOpenapiJsonRequest<FreeLoginToken> {

    /**
     * xrxs员工手机号
     */
    private String mobile;

    /**
     * xrxs员工手机号
     */
    private Integer userType;

    public MobileFreeLoginTokenRequest(String accessToken) {
        super(accessToken);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<FreeLoginToken> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<FreeLoginToken>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<FreeLoginToken>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("免登手机号为空!");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/login/mobile/token";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("mobile", mobile);
        map.put("userType", userType);
        return map;
    }
}
