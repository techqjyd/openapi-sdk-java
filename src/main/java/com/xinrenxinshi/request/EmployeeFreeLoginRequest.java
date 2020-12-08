package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.ERedirectTypeEnum;
import com.xinrenxinshi.common.EUserTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.IOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工免登
 *
 * @param
 * @author zhaopengcheng
 */
public class EmployeeFreeLoginRequest extends AbstractOpenapiJsonRequest<String> {
    /**
     * access_token
     */
    protected String access_token;

    /**
     * 免登的员工id
     */
    protected String employeeId;

    /**
     * 免登的员工手机号
     */
    protected String mobile;

    /**
     * 免登token
     */
    protected String token;

    /**
     * 免登的跳转页面类型
     */
    protected Integer redirectUrlType;

    /**
     * 免登参数
     */
    protected Map<String, String> redirectParam;

    /**
     * 免登类型
     */
    protected ERedirectTypeEnum redirectType;

    /**
     * 免登类型
     */
    protected EUserTypeEnum userType;

    public EmployeeFreeLoginRequest(String access_token) {
        super(access_token);
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getRedirectUrlType() {
        return redirectUrlType;
    }

    public void setRedirectUrlType(Integer redirectUrlType) {
        this.redirectUrlType = redirectUrlType;
    }

    public Map<String, String> getRedirectParam() {
        return redirectParam;
    }

    public void setRedirectParam(Map<String, String> redirectParam) {
        this.redirectParam = redirectParam;
    }

    public ERedirectTypeEnum getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(ERedirectTypeEnum redirectType) {
        this.redirectType = redirectType;
    }

    public EUserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(EUserTypeEnum userType) {
        this.userType = userType;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return null;
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>(){

        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId) && XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工ID或手机号为空");
        }
        if (XRXSStrUtils.isEmpty(access_token)) {
            throw new ParamNotValidException("access_token为空");
        }
        if (XRXSStrUtils.isEmpty(token)) {
            throw new ParamNotValidException("免登token为空");
        }
        if (null == redirectType) {
            throw new ParamNotValidException("免登跳转类型为空");
        }
    }


    @Override
    public String getBizUrl() {
        if (!XRXSStrUtils.isEmpty(employeeId)) {
            return "/v5/login/" + redirectType.getDesc();
        } else {
            return "/v5/login/mobile/" + redirectType.getDesc();
        }
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        if (!XRXSStrUtils.isEmpty(employeeId)) {
            map.put("employeeId", employeeId);
        }
        if (!XRXSStrUtils.isEmpty(mobile)) {
            map.put("mobile", mobile);
        }
        map.put("token", token);
        map.put("access_token", access_token);
        map.put("redirectUrlType", redirectUrlType);
        map.put("redirectParam", redirectParam);
        if (userType != null) {
            map.put("userType", userType.getUserType());
        }
        return map;
    }

}
