package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.OpenapiTokenResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

import static com.xinrenxinshi.common.Constants.GRANT_TYPE_CREDENTIALS;

/**
 * 获取token信息request
 *
 * @author: liuchenhui
 * @create: 2019-11-04 18:48
 **/
public class OpenapiTokenRequest extends AbstractOpenapiRequest<OpenapiTokenResponse> {

    /**
     * 凭证信息appKey
     */
    private String clientId;
    /**
     * 凭证密钥appSecret
     */
    private String clientSecret;

    public OpenapiTokenRequest() {
    }

    public OpenapiTokenRequest(String accessToken) {
        super(accessToken);
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<OpenapiTokenResponse> getResponseClass() {
        return OpenapiTokenResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (!XRXSStrUtils.areNotEmpty(clientId, clientSecret)) {
            throw new ParamNotValidException("appKey或appSecret为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/authorize/oauth/token";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("grant_type", GRANT_TYPE_CREDENTIALS);
        map.put("client_id", clientId);
        map.put("client_secret", clientSecret);
        return map;
    }
}
