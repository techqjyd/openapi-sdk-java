package com.xinrenxinshi.openapi;

import com.xinrenxinshi.util.SecUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * request抽象
 *
 * @author: liuchenhui
 * @create: 2019-11-12 19:21
 **/
public abstract class AbstractOpenapiRequest<T> implements IOpenapiRequest<T> {
    /**
     * token
     */
    protected String accessToken;

    protected AbstractOpenapiRequest() {
    }

    public AbstractOpenapiRequest(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        Map<String, String> headerMap = new HashMap<>(1);
        headerMap.put("access_token", accessToken);
        return headerMap;
    }

    @Override
    public Map<String, Object> getParamMap() {
        Map<String, Object> paraMap = getParamMap0();
        if (paraMap == null) {
            paraMap = new HashMap<>(2);
        }
        Long timestamp = System.currentTimeMillis();
        paraMap.put("timestamp", timestamp);
        paraMap.put("sign", SecUtil.sign(paraMap, XrxsOpenapiClient.getInstance().getAppSecret()));
        return paraMap;
    }

    /**
     * 各业务参数
     */
    protected abstract Map<String, Object> getParamMap0();

    public String getAccessToken() {
        return accessToken;
    }

    protected void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
