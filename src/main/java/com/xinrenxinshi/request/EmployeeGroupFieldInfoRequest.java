package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeGroupFieldInfoResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查询员工分组字段信息
 *
 * @author hzz on 2022/05/12
 */
public class EmployeeGroupFieldInfoRequest extends AbstractOpenapiJsonRequest<List<EmployeeGroupFieldInfoResult>> {

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EmployeeGroupFieldInfoRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        HashMap<String, Object> map = new HashMap<>(4);
        map.put("groupId", groupId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<EmployeeGroupFieldInfoResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<EmployeeGroupFieldInfoResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<EmployeeGroupFieldInfoResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (groupId == null) {
            throw new ParamNotValidException("分组id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/field/groupId";
    }
}
