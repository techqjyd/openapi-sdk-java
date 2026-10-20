package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author itar.deng
 * @version 1.0
 * @date 2025/4/25 19:19
 * @jdk 1.8
 * @description
 **/
public class EmployeeEntryRemindRequest extends AbstractOpenapiJsonRequest<Boolean> {


    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 提醒渠道
     *
     * @see 1邮件 2短信
     * 默认邮件提醒
     */
    private List<Integer> remindChannel;


    public EmployeeEntryRemindRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("employeeId", employeeId);
        map.put("remindChannel", remindChannel);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Boolean> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Boolean>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Boolean>>() {
        };
    }


    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/entry/remind";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<Integer> getRemindChannel() {
        return remindChannel;
    }

    public void setRemindChannel(List<Integer> remindChannel) {
        this.remindChannel = remindChannel;
    }
}
