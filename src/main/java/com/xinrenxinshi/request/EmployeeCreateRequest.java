package com.xinrenxinshi.request;

import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.HireTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.EmployeeCreateResponse;
import com.xinrenxinshi.util.JsonUtils;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工创建request
 *
 * @author: liuchenhui
 * @create: 2019-11-06 17:14n
 **/
@SuppressWarnings("all")
public class EmployeeCreateRequest extends AbstractOpenapiRequest<EmployeeCreateResponse> {
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

    public EmployeeCreateRequest(String accessToken) {
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
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<EmployeeCreateResponse> getResponseClass() {
        return EmployeeCreateResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("员工名字为空");
        }
        if (XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("手机号为空");
        }
        if (XRXSStrUtils.isEmpty(entryDate)) {
            throw new ParamNotValidException("入职时间为空");
        }
        if (fields == null || fields.size() == 0) {
            throw new ParamNotValidException("员工其他信息为空");
        }
        if (hireType == null) {
            throw new ParamNotValidException("聘用类型为空");
        }
        if (!XRXSDateUtils.isDateStr(entryDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("入职时间不符合yyyy-MM-dd格式校验");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/employee/entry";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("name", name);
        map.put("mobile", mobile);
        map.put("entryDate", entryDate);
        map.put("fields", JsonUtils.toJson(fields));
        map.put("hireType", hireType.getHireType());
        return map;
    }
}
