package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.AttendanceStatisticsResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * <我的考勤统计 请求参数>.
 *
 * @author peng cheng
 * @date 2021/6/24
 * @since
 */
public class AttendanceStatisticsRequest extends AbstractOpenapiJsonRequest<AttendanceStatisticsResponse> {

    private String employeeId;

    private String mobile;

    public AttendanceStatisticsRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("employeeId",employeeId);
        map.put("mobile",mobile);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return  MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<AttendanceStatisticsResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<AttendanceStatisticsResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<AttendanceStatisticsResponse>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)&&XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工employeeId和mobile不能同时为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/statistics";
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
}
