package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EmpGroupEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeGroupField;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 员工分组字段信息查询
 *
 * @author Ke Zhan on 2020/11/19
 */
public class EmployeeGroupFieldRequest extends AbstractOpenapiJsonRequest<List<EmployeeGroupField>> {

    /**
     * 分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     */
    private EmpGroupEnum groupType;

    public EmployeeGroupFieldRequest(String accessToken) {
        super(accessToken);
    }

    public EmpGroupEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(EmpGroupEnum groupType) {
        this.groupType = groupType;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        HashMap<String, Object> map = new HashMap<>(4);
        map.put("groupType", groupType.getCode());
        return map;
    }

    @Override
    public TypeReference<OpenapiResponse<List<EmployeeGroupField>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<EmployeeGroupField>>>() {
        };
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<EmployeeGroupField>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (groupType == null) {
            throw new ParamNotValidException("分组类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/fields";
    }
}
