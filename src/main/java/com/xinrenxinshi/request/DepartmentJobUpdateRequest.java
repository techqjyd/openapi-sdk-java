package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentJobUpdateRequest extends AbstractOpenapiJsonRequest<Object> {
    public DepartmentJobUpdateRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 岗位id
     */
    private String jobId;
    /**
     * 岗位所属的分类id
     */
    private String parentId;

    /**
     *  岗位分类 // 0-岗位分类，1-岗位实体
     */
    private Integer type;

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 岗位编码
     */
    private String code;

    /**
     * 岗位备注
     */
    private String remark;

    /**
     * 岗位说明
     */
    private String introduction;

    /**
     * 适用部门
     */
    private List<String> departmentIds;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("jobId",jobId);
        map.put("parentId", parentId);
        map.put("type", type);
        map.put("name", name);
        map.put("code", code);
        map.put("remark", remark);
        map.put("introduction", introduction);
        map.put("departmentIds", departmentIds);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(jobId)) {
            throw new ParamNotValidException("jobId为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/jobdictionary/update";
    }
}
