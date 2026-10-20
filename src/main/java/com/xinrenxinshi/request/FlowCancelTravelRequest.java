package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalApplyResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class FlowCancelTravelRequest extends AbstractOpenapiJsonRequest<ApprovalApplyResponse> {

    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 原审批id
     */
    private String srcApproveId;

    /**
     * 开始时间 yyyy-MM-dd
     */
    private String startDate;

    /**
     * 时间类型 0 上半天 1 下半天
     */
    private Integer startTime;

    /**
     * 结束时间
     */
    private String endDate;

    /**
     * 时间类型 0 上半天 1 下半天
     */
    private Integer endTime;




    public FlowCancelTravelRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getSrcApproveId() {
        return srcApproveId;
    }

    public void setSrcApproveId(String srcApproveId) {
        this.srcApproveId = srcApproveId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("srcApproveId",srcApproveId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<ApprovalApplyResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<ApprovalApplyResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ApprovalApplyResponse>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工employeeId不能为空");
        }
        if (startDate == null) {
            throw new ParamNotValidException("出差开始日期为空");
        }
        if (endDate == null) {
            throw new ParamNotValidException("出差结束日期为空");
        }
        if (startTime == null) {
            throw new ParamNotValidException("出差开始时间为空");
        }
        if (endTime == null) {
            throw new ParamNotValidException("出差结束时间为空");
        }
        if(XRXSStrUtils.isEmpty(srcApproveId)){
            throw new ParamNotValidException("srcApproveId不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/travel/cancel";
    }
}
