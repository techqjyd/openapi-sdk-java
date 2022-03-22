package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.HireTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.JsonUtils;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工信息更新response
 *
 * @author: liuchenhui
 * @create: 2019-11-13 16:02
 **/
public class EmployeeUpdateRequest extends AbstractOpenapiJsonRequest<Void> {

    /**
     * 员工ID
     */
    private String employeeId;

    /**
     * 员工名字
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 聘用类型，0-正式,10-实习,11-劳务,12-顾问,13-返聘
     */
    private HireTypeEnum hireType;
    /**
     * JsonMap,员工信息其余字段,以薪人薪事系统的字段名为key,员工该字段的值为value
     */
    private Map<String, String> fields;
    /**
     * 入职时间,格式2017-03-02
     */
    private String entryDate;

    public EmployeeUpdateRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public HireTypeEnum getHireType() {
        return hireType;
    }

    public void setHireType(HireTypeEnum hireType) {
        this.hireType = hireType;
    }

    public Map<String, String> getFields() {
        return fields;
    }

    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("employeeId", employeeId);
        if (!XRXSStrUtils.isEmpty(name)) {
            map.put("name", name);
        }
        if (!XRXSStrUtils.isEmpty(mobile)) {
            map.put("mobile", mobile);
        }
        if (!XRXSStrUtils.isEmpty(entryDate)) {
            map.put("entryDate", entryDate);
        }
        map.put("fields", fields);
        if (hireType != null) {
            map.put("hireType", hireType.getHireType());
        }
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
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID为空");
        }
        if(!XRXSStrUtils.isEmpty(entryDate)){
            if (!XRXSDateUtils.isDateStr(entryDate, Constants.DATE_STRING_FORMAT)) {
                throw new ParamNotValidException("入职时间不符合yyyy-MM-dd格式校验");
            }
        }
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>(){};
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/update";
    }
}
