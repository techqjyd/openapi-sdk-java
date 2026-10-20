package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PayrollEmployeeBasePayFormResponse;
import com.xinrenxinshi.response.PayrollEmployeePreBasePayFormResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayrollBaseFormSubmitRequest extends AbstractOpenapiJsonRequest<Object> {

    /**
     * 员工ID - 必填
     */
    private String employeeId;

    /**
     * 基本薪资（非正式员工的定薪值） 聘用形式为非正式时 必填
     */
    private Double basePay;

    /**
     * 转正薪资（正式员工的转正后基本工资） 聘用形式为正式时 必填
     */
    private Double regularPay;

    /**
     * 试用期薪资（正式员工的试用期基本工资）聘用形式为正式时 必填
     */
    private Double probationaryPay;

    /**
     * 聘用形式 0:正式, 10:实习, 11:劳务, 12:顾问, 13:返聘, 14:外包, 15:兼职, 16:灵活用工, 17:劳务派遣, 18:派遣, 19:见习, 20:临时工, 21:小时工
     */
    private Integer hireType;

    /**
     * 计薪方式 0-按月 1-按日 只有非正式类型才有效 聘用形式为非正式时 必填
     */
    private Integer payType;

    /**
     * 自定义基本工资项（非正式员工 payType=1，即按日结算时 此工资项不可用）
     */
    private List<PayrollEmployeeBasePayFormResponse.CustomPayrollItemDO> customBasePay;

    /**
     * 自定义岗位工资项目
     */
    private List<PayrollEmployeeBasePayFormResponse.CustomPayrollItemDO> noAttendancePay;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    public Double getRegularPay() {
        return regularPay;
    }

    public void setRegularPay(Double regularPay) {
        this.regularPay = regularPay;
    }

    public Double getProbationaryPay() {
        return probationaryPay;
    }

    public void setProbationaryPay(Double probationaryPay) {
        this.probationaryPay = probationaryPay;
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

    public List<PayrollEmployeeBasePayFormResponse.CustomPayrollItemDO> getCustomBasePay() {
        return customBasePay;
    }

    public void setCustomBasePay(List<PayrollEmployeeBasePayFormResponse.CustomPayrollItemDO> customBasePay) {
        this.customBasePay = customBasePay;
    }

    public List<PayrollEmployeeBasePayFormResponse.CustomPayrollItemDO> getNoAttendancePay() {
        return noAttendancePay;
    }

    public void setNoAttendancePay(List<PayrollEmployeeBasePayFormResponse.CustomPayrollItemDO> noAttendancePay) {
        this.noAttendancePay = noAttendancePay;
    }

    public PayrollBaseFormSubmitRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(12);
        map.put("employeeId", employeeId);
        map.put("basePay", basePay);
        map.put("regularPay", regularPay);
        map.put("probationaryPay", probationaryPay);
        map.put("hireType", hireType);
        map.put("payType", payType);
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
        return "/v5/payroll/base/form/submit";
    }
}
