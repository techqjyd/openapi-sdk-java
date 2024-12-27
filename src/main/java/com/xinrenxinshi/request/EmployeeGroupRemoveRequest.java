package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EmpGroupEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工分组信息删除请求
 *
 * @author Ke Zhan on 2020/11/19
 */
public class EmployeeGroupRemoveRequest extends AbstractOpenapiJsonRequest<Object> {

    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 更新分组信息记录ID
     */
    private String recordId;
    /**
     * 分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     */
    private EmpGroupEnum groupType;

    public EmployeeGroupRemoveRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public EmpGroupEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(EmpGroupEnum groupType) {
        this.groupType = groupType;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("recordId", recordId);
        map.put("groupType", groupType.getCode());
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工Id为空");
        }
        if (XRXSStrUtils.isEmpty(recordId)) {
            throw new ParamNotValidException("分组信息记录id为空");
        }
        if (groupType == null) {
            throw new ParamNotValidException("分组类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/delete";
    }
}
