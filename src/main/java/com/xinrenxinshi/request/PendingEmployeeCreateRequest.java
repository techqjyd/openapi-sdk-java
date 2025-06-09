package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.*;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.EmpToBeHiredCreateResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 待入职员工创建Request
 *
 * @author: liuchenhui
 * @create: 2019-11-12 15:04
 **/
public class PendingEmployeeCreateRequest extends AbstractOpenapiJsonRequest<EmpToBeHiredCreateResponse> {

    /**
     * 员工名字
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 入职时间，格式yyyy-MM-dd
     */
    private String entryDate;
    /**
     * 聘用类型，0-正式,10-实习,11-劳务,12-顾问,13-返聘
     */
    private HireTypeEnum hireType;

    /**
     * 是否给员工发送完善个人信息的邮件 0:不发送，1:发送。默认为0不发送
     */
    private String sendEmail;

    /**
     * JsonMap,员工信息其余字段,以薪人薪事系统的字段名为key,员工该字段的值为value
     */
    private Map<String, String> fields;

    public Map<String, String> getFields() {
        return fields;
    }

    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }

    public PendingEmployeeCreateRequest(String accessToken) {
        super(accessToken);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public HireTypeEnum getHireType() {
        return hireType;
    }

    public void setHireType(HireTypeEnum hireType) {
        this.hireType = hireType;
    }
    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<EmpToBeHiredCreateResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("员工名字为空");
        }
        if (XRXSStrUtils.isEmpty(entryDate) || !XRXSDateUtils.isDateStr(entryDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("入职时间为空或者入职时间格式不满足yyyy-MM-dd校验");
        }
        if (hireType == null) {
            throw new ParamNotValidException("雇佣类型为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<EmpToBeHiredCreateResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<EmpToBeHiredCreateResponse>>(){};
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/createpending";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("name", name);
        map.put("mobile", mobile);
        map.put("email", email);
        map.put("entryDate", entryDate);
        map.put("hireType", hireType.getHireType());
        if (sendEmail != null) {
            map.put("sendEmail", sendEmail);
        }
        map.put("fields", fields);
        return map;
    }
}
