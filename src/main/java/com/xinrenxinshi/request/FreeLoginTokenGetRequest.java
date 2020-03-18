package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.FreeLoginTokenGetResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取免登token reqest
 *
 * @author: liuchenhui
 * @create: 2019-11-06 18:17
 **/
public class FreeLoginTokenGetRequest extends AbstractOpenapiRequest<FreeLoginTokenGetResponse> {

    /**
     * xrxs员工ID，与第三方员工id，两者必传其一，需要单独加密，然后参与签名
     */
    private String employeeId;

    public FreeLoginTokenGetRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<FreeLoginTokenGetResponse> getResponseClass() {
        return FreeLoginTokenGetResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("薪人薪事员工ID和第三方员工ID都为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v4/login/token";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        return map;
    }
}
