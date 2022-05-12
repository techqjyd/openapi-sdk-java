package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.FlowHolidayOffResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowHolidayOffDDayRequest extends AbstractOpenapiJsonRequest<List<FlowHolidayOffResult>> {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 截止日期
     */
    private String endDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public FlowHolidayOffDDayRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        map.put("endDate", endDate);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<FlowHolidayOffResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<FlowHolidayOffResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<FlowHolidayOffResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工id为空");
        }
        if (XRXSStrUtils.isEmpty(endDate)) {
            throw new ParamNotValidException("截止日期为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/holiday/off";
    }
}
