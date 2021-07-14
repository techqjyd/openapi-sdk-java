package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.DepartTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.DepartmentCreateResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门创建request
 *
 * @author: liuchenhui
 * @create: 2019-11-08 16:34
 **/
public class DepartmentCreateRequest extends AbstractOpenapiJsonRequest<DepartmentCreateResponse> {

    /**
     * 部门名称
     */
    private String name;
    /**
     * 上级部门ID
     */
    private String parentId;
    /**
     * 部门编码
     */
    private String code;
    /**
     * 部门类型,0-部门,1-事业部,2-事业群,3-组,4-中心,5-子公司
     */
    private DepartTypeEnum type;
    /**
     * 管理员ID
     */
    private String adminId;
    /**
     * 所属城市
     */
    private String city;
    /**
     * 备注
     */
    private String remark;

    /**
     * 部门自定义字段
     */
    private Map<String,String> fields;

    public Map<String, String> getFields() {
        return fields;
    }

    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }

    public DepartmentCreateRequest(String accessToken) {
        super(accessToken);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DepartTypeEnum getType() {
        return type;
    }

    public void setType(DepartTypeEnum type) {
        this.type = type;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<DepartmentCreateResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("部门名称为空");
        }
        if (XRXSStrUtils.isEmpty(code)) {
            throw new ParamNotValidException("部门编码为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/create";
    }

    @Override
    public TypeReference<OpenapiResponse<DepartmentCreateResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<DepartmentCreateResponse>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("name", name);
        map.put("code", code);
        if (!XRXSStrUtils.isEmpty(parentId) && parentId.length() == 32) {
            map.put("parentId", parentId);
        }
        if (!XRXSStrUtils.isEmpty(adminId)) {
            map.put("adminId", adminId);
        }
        if (!XRXSStrUtils.isEmpty(city)) {
            map.put("city", city);
        }
        if (!XRXSStrUtils.isEmpty(remark)) {
            map.put("remark", remark);
        }
        if (type != null) {
            map.put("type", type.getType());
        }
        if (fields != null) {
            map.put("fields", fields);
        }
        return map;
    }
}
