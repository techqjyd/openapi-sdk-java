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
 * 员工分组信息更新请求
 *
 * @author Ke Zhan on 2020/11/19
 */
public class EmployeeGroupUpdateRequest extends AbstractOpenapiJsonRequest<Object> {
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
    /**
     * 更新分组信息记录 Map<String, String>, Map的key需要更新字段页面展示文案（分组字段中的labelName），Map的Value更新字段设置的新值(选项类型值为dataSource的Key)
     */
    private Map<String, String> employeeFields;

    public EmployeeGroupUpdateRequest(String accessToken) {
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

    public Map<String, String> getEmployeeFields() {
        return employeeFields;
    }

    public void setEmployeeFields(Map<String, String> employeeFields) {
        this.employeeFields = employeeFields;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("recordId", recordId);
        map.put("groupType", groupType.getCode());
        map.put("employeeFields", employeeFields);
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
        if (employeeFields == null || employeeFields.size() == 0) {
            throw new ParamNotValidException("分组信息记录为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/update";
    }
}
