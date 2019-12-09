package com.xinrenxinshi.request;

import com.xinrenxinshi.common.DepartTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门更新request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:41
 **/
public class DepartmentUpdateRequest extends AbstractOpenapiRequest<OpenapiResponse> {

    /**
     * 部门ID
     */
    private String departmentId;
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
    private String reamrk;

    public DepartmentUpdateRequest(String accessToken) {
        super(accessToken);
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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

    public String getReamrk() {
        return reamrk;
    }

    public void setReamrk(String reamrk) {
        this.reamrk = reamrk;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<OpenapiResponse> getResponseClass() {
        return OpenapiResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/department/update";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("departmentId", departmentId);
        if (!XRXSStrUtils.isEmpty(name)) {
            map.put("name", name);
        }
        if (!XRXSStrUtils.isEmpty(code)) {
            map.put("code", code);
        }
        if (!XRXSStrUtils.isEmpty(parentId)) {
            map.put("parentId", parentId);
        }
        if (!XRXSStrUtils.isEmpty(adminId)) {
            map.put("adminId", adminId);
        }
        if (!XRXSStrUtils.isEmpty(reamrk)) {
            map.put("remark", reamrk);
        }
        if (!XRXSStrUtils.isEmpty(city)) {
            map.put("city", city);
        }
        if (type != null) {
            map.put("type", type.getType());
        }
        return map;
    }
}
