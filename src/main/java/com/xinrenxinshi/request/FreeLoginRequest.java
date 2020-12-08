package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EUserTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * <免登请求>.
 *
 * @author peng cheng
 * @date 2020/12/3
 * @since
 */
public class FreeLoginRequest extends AbstractOpenapiJsonRequest<String> {

    /**
     * 登录的员工id
     */
    private String employeeId;

    /**
     * 登录的员工手机号
     */
    private String mobile;

    /**
     * 用户类型 默认 登录用户类型为员工
     *
     * @see
     */
    private Integer userType = EUserTypeEnum.EMPLOYEE.getUserType();

    /**
     * 跳转类型
     *
     * @see com.xinrenxinshi.common.ERedirectTypeEnum
     */
    private Integer redirectType;

    /**
     * 页面跳转类型
     * <p>
     * 如果 redirectType = ERedirectTypeEnum.H5 则跳转类型
     *
     * @see com.xinrenxinshi.common.RedirectUrlTypeEnum
     * <p>
     * 如果 redirectType = ERedirectTypeEnum.PC 则跳转类型
     * @see com.xinrenxinshi.common.EPcUrlTypeEnum
     */
    private Integer redirectUrlType;

    /**
     * 跳转参数
     */
    private Map<String, String> redirectParam = new HashMap<>();

    public FreeLoginRequest(String accessToken) {
        super(accessToken);
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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(Integer redirectType) {
        this.redirectType = redirectType;
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

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("mobile", mobile);
        map.put("userType", userType);
        map.put("redirectType", redirectType);
        if (redirectUrlType != null) {
            map.put("redirectUrlType", redirectUrlType);
        }
        if (redirectParam != null && redirectParam.size() > 0){
            map.put("redirectParam", redirectParam);
        }
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId) && XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工id和手机号不能同时为空");
        }
        if (null == userType) {
            throw new ParamNotValidException("用户类型不能为空");
        }
        if (null == redirectType) {
            throw new ParamNotValidException("跳转类型不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/login/geturl";
    }
}
