package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PayrollEmployeeAdjustmentFormResponse;
import com.xinrenxinshi.response.PayrollEmployeeBasePayFormResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayrollAdjustFormSubmitRequest extends AbstractOpenapiJsonRequest<Object> {

    /**
     * 员工ID - 必填
     */
    private String employeeId;

    /**
     * 调薪前基本工资 - 必填
     */
    private Double beforeBasePay;

    /**
     * 调薪后基本工资 -必填
     */
    private Double afterBasePay;

    /**
     * 聘用形式 0:正式, 10:实习, 11:劳务, 12:顾问, 13:返聘, 14:外包, 15:兼职, 16:灵活用工, 17:劳务派遣, 18:派遣, 19:见习, 20:临时工, 21:小时工
     */
    private Integer hireType;

    /**
     * 计薪方式 0-按月 1-按日 只有非正式类型才有效
     */
    private Integer payType;

    /**
     * 调薪原因
     */
    private String reason;

    /**
     * 调薪生效时间 yyyy-mm-dd 必填
     */
    private String happenDate;

    /**
     * 自定义基本工资
     */
    private List<PayrollEmployeeAdjustmentFormResponse.CustomPayrollItemChangeDO> customBasePay;

    /**
     * 自定义岗位工资
     */
    private List<PayrollEmployeeAdjustmentFormResponse.CustomPayrollItemChangeDO> noAttendancePay;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getBeforeBasePay() {
        return beforeBasePay;
    }

    public void setBeforeBasePay(Double beforeBasePay) {
        this.beforeBasePay = beforeBasePay;
    }

    public Double getAfterBasePay() {
        return afterBasePay;
    }

    public void setAfterBasePay(Double afterBasePay) {
        this.afterBasePay = afterBasePay;
    }

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(String happenDate) {
        this.happenDate = happenDate;
    }

    public List<PayrollEmployeeAdjustmentFormResponse.CustomPayrollItemChangeDO> getCustomBasePay() {
        return customBasePay;
    }

    public void setCustomBasePay(List<PayrollEmployeeAdjustmentFormResponse.CustomPayrollItemChangeDO> customBasePay) {
        this.customBasePay = customBasePay;
    }

    public List<PayrollEmployeeAdjustmentFormResponse.CustomPayrollItemChangeDO> getNoAttendancePay() {
        return noAttendancePay;
    }

    public void setNoAttendancePay(List<PayrollEmployeeAdjustmentFormResponse.CustomPayrollItemChangeDO> noAttendancePay) {
        this.noAttendancePay = noAttendancePay;
    }

    public PayrollAdjustFormSubmitRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(12);
        map.put("employeeId", employeeId);
        map.put("beforeBasePay", beforeBasePay);
        map.put("afterBasePay", afterBasePay);
        map.put("hireType", hireType);
        map.put("payType", payType);
        map.put("reason", reason);
        map.put("happenDate", happenDate);
        map.put("customBasePay", customBasePay);
        map.put("noAttendancePay", noAttendancePay);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/adjust/form/submit";
    }
}
