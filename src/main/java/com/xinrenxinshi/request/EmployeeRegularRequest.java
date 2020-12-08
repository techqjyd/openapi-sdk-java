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
 * 转正式操作
 *
 * @author Ke Zhan on 2020/11/18
 */
public class EmployeeRegularRequest extends AbstractOpenapiJsonRequest<Void> {

    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 非正式转正式日期，格式：yyyy-MM-dd
     */
    private String regularHireTypeDate;
    /**
     * 试用期转正日期，格式：yyyy-MM-dd
     */
    private String regularDate;
    /**
     * 工号
     */
    private String jobNumber;

    public EmployeeRegularRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRegularHireTypeDate() {
        return regularHireTypeDate;
    }

    public void setRegularHireTypeDate(String regularHireTypeDate) {
        this.regularHireTypeDate = regularHireTypeDate;
    }

    public String getRegularDate() {
        return regularDate;
    }

    public void setRegularDate(String regularDate) {
        this.regularDate = regularDate;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        HashMap<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("regularHireTypeDate", regularHireTypeDate);
        map.put("regularDate", regularDate);
        map.put("jobNumber", jobNumber);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID为空");
        }
        if (XRXSStrUtils.isEmpty(regularHireTypeDate)) {
            throw new ParamNotValidException("非正式转正式日期为空");
        }
        if (!XRXSDateUtils.isDateStr(regularHireTypeDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("非正式转正式日期，格式：yyyy-MM-dd");
        }
        if (!XRXSDateUtils.isDateStr(regularDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("试用期转正日期，格式：yyyy-MM-dd");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/regular";
    }
}
