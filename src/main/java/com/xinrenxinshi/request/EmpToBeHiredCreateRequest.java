package com.xinrenxinshi.request;

import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.LaborTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
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
public class EmpToBeHiredCreateRequest extends AbstractOpenapiRequest<EmpToBeHiredCreateResponse> {

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
     * 雇佣类型 0：正式，1：非正式
     */
    private Integer hireType;
    /**
     * 10-实习,11-劳务,12-顾问,13-返聘,当hireType=1的时候必填，当hireType=0的时候，一般默认laborType默认设置为10
     */
    private LaborTypeEnum laborType;

    public EmpToBeHiredCreateRequest(String accessToken) {
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

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public LaborTypeEnum getLaborType() {
        return laborType;
    }

    public void setLaborType(LaborTypeEnum laborType) {
        this.laborType = laborType;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<EmpToBeHiredCreateResponse> getResponseClass() {
        return EmpToBeHiredCreateResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("员工名字为空");
        }
        if (XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("手机号为空");
        }
        if (XRXSStrUtils.isDigits(email)) {
            throw new ParamNotValidException("邮箱为空");
        }
        if (XRXSStrUtils.isEmpty(entryDate) || !XRXSDateUtils.isDateStr(entryDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("入职时间为空或者入职时间格式不满足yyyy-MM-dd校验");
        }
        if (hireType == null) {
            throw new ParamNotValidException("雇佣类型为空");
        }
        if (0 != hireType && 1 != hireType) {
            throw new ParamNotValidException("雇佣类型必须填入0或者1");
        }
        if (1 == hireType && laborType == null) {
            throw new ParamNotValidException("当hireType=1的时,聘用类型必填");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/employee/entryPending";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("name", name);
        map.put("mobile", mobile);
        map.put("email", email);
        map.put("entryDate", entryDate);
        map.put("hireType", hireType);
        if (laborType != null) {
            map.put("laborType", laborType.getLaborType());
        }
        return map;
    }
}
