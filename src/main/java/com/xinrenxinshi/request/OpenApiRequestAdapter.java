package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.ERequestPath;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.IParam;
import com.xinrenxinshi.openapi.OpenapiResponse;
import lombok.Setter;

import java.util.Map;

/**
 * @author wangyuan
 * @date 2020/7/2 下午3:24
 */
@Setter
public class OpenApiRequestAdapter<T extends IParam, K extends OpenapiResponse> extends AbstractOpenapiRequest<K> {
    /**
     * 请求方式
     */
    private ERequestPath requestPath;
    /**
     * 请求参数
     */
    private T param;
    /**
     * 结果对象
     */
    private Class<K> responseClass;
    /**
     * 结果的TypeReference
     */
    private TypeReference<K> responseTypeRef;

    public OpenApiRequestAdapter(String accessToken, T param, ERequestPath requestPath) {
        this.param = param;
        this.requestPath = requestPath;
        this.accessToken = accessToken;
    }

    public OpenApiRequestAdapter(String accessToken, T param, ERequestPath requestPath, TypeReference<K> typeReference) {
        this.param = param;
        this.requestPath = requestPath;
        this.responseTypeRef = typeReference;
        this.accessToken = accessToken;
    }


    @Override
    public MethodEnum getMethod() {
        return requestPath.getMethod();
    }

    @Override
    public Class<K> getResponseClass() {
        return responseClass;
    }

    @Override
    public TypeReference<K> getResponseTypeRef() {
        return responseTypeRef;
    }

    @Override
    public void check() throws ParamNotValidException {
        param.check();
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return param.getParamMap();
    }

    @Override
    public String getBizUrl() {
        return requestPath.getPath();
    }
}
