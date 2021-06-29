package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.AttendanceStatisticsResponse;
import com.xinrenxinshi.response.EmployeeCareersResponse;
import com.xinrenxinshi.util.XRXSListUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <我的考勤统计 请求参数>.
 *
 * @author peng cheng
 * @date 2021/6/24
 * @since
 */
public class EmployeeCareersRequest extends AbstractOpenapiJsonRequest<Map<String, List<EmployeeCareersResponse>>> {

    private List<String> employeeIds;


    public EmployeeCareersRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("employeeIds",employeeIds);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return  MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Map<String, List<EmployeeCareersResponse>>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Map<String, List<EmployeeCareersResponse>>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Map<String, List<EmployeeCareersResponse>>>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSListUtils.isEmpty(employeeIds)) {
            throw new ParamNotValidException("员工employeeIds为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/careers";
    }

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
        this.employeeIds = employeeIds;
    }
}
