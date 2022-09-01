package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 试用期员工转正操作
 *
 * @author hzz on 2022/07/14
 */
public class EmployeeToRegularRequest extends AbstractOpenapiJsonRequest<Void> {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 转正日期
     */
    private String regularDate;

    /**
     * 是否自动调薪
     */
    private Integer isAutoAdjust;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRegularDate() {
        return regularDate;
    }

    public void setRegularDate(String regularDate) {
        this.regularDate = regularDate;
    }

    public Integer getIsAutoAdjust() {
        return isAutoAdjust;
    }

    public void setIsAutoAdjust(Integer isAutoAdjust) {
        this.isAutoAdjust = isAutoAdjust;
    }

    public EmployeeToRegularRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        HashMap<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("regularDate", regularDate);
        map.put("isAutoAdjust",isAutoAdjust);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID为空");
        }
        if (!XRXSDateUtils.isDateStr(regularDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("转正日期，格式：yyyy-MM-dd");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/toregular";
    }
}
