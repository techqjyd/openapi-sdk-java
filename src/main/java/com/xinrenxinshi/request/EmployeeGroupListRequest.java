package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EmpGroupEnum;
import com.xinrenxinshi.common.EmployeeStatusEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeGroupFieldData;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSListUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 员工分组信息批量查询请求
 *
 * @author Ke Zhan on 2020/11/19
 */
public class EmployeeGroupListRequest extends AbstractOpenapiJsonRequest<List<EmployeeGroupFieldData>> {

    /**
     * 员工id
     */
    private List<String> employeeIds;
    /**
     * 分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     */
    private EmpGroupEnum groupType;
    private EmployeeStatusEnum employeeStatus;

    public EmployeeGroupListRequest(String accessToken) {
        super(accessToken);
    }


    public EmpGroupEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(EmpGroupEnum groupType) {
        this.groupType = groupType;
    }

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public EmployeeStatusEnum getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatusEnum employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(3);
        map.put("employeeIds", employeeIds);
        map.put("groupType", groupType.getCode());
        if (employeeStatus == null) {
            map.put("status", 0);
        } else {
            map.put("employeeStatus", employeeStatus.getValue());
        }
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public TypeReference<OpenapiResponse<List<EmployeeGroupFieldData>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<EmployeeGroupFieldData>>>() {
        };
    }

    @Override
    public OpenapiResponse<List<EmployeeGroupFieldData>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSListUtils.isEmpty(employeeIds)) {
            throw new ParamNotValidException("员工Id为空");
        }
        if (employeeIds.size() > 100){
            throw new ParamNotValidException("员工Id列表最多100个");
        }
        if (groupType == null) {
            throw new ParamNotValidException("分组类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/list";
    }
}
