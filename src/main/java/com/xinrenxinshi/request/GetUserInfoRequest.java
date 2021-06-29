package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EUserTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.LoginInfoResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * <获取登录用户信息请求>.
 *
 * @author peng cheng
 * @date 2020/12/3
 * @since
 */
public class GetUserInfoRequest extends AbstractOpenapiJsonRequest<LoginInfoResult> {

    /**
     * 授权认证code
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GetUserInfoRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("code", code);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public TypeReference<OpenapiResponse<LoginInfoResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<LoginInfoResult>>() {
        };
    }

    @Override
    public OpenapiResponse<LoginInfoResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(code) ) {
            throw new ParamNotValidException("授权认证code不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/login/getuserinfo";
    }
}
