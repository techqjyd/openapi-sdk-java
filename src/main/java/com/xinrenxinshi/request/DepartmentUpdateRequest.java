package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.DepartTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门更新request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:41
 **/
@Getter
@Setter
public class DepartmentUpdateRequest extends AbstractOpenapiJsonRequest<Object> {

    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门英文名
     */
    private String enName;
    /**
     * 上级部门ID
     */
    private String parentId;

    private String hrbpId;
    /**
     * 部门编码
     */
    private String code;
    /**
     * 部门类型,0-部门,1-事业部,2-事业群,3-组,4-中心,5-子公司
     */
    private Integer type;
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

    private Integer isVirtual;

    /**
     * 部门自定义字段
     */
    private Map<String,String> fields;

    public DepartmentUpdateRequest(String accessToken) {
        super(accessToken);
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
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/update";
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("departmentId", departmentId);
        if (!XRXSStrUtils.isEmpty(name)) {
            map.put("name", name);
        }
        if (!XRXSStrUtils.isEmpty(enName)) {
            map.put("enName", enName);
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
        if (!XRXSStrUtils.isEmpty(remark)) {
            map.put("remark", remark);
        }
        if (!XRXSStrUtils.isEmpty(city)) {
            map.put("city", city);
        }
        if (!XRXSStrUtils.isEmpty(hrbpId)) {
            map.put("hrbpId", hrbpId);
        }
        if (type != null) {
            map.put("type", type);
        }
        if (fields != null) {
            map.put("fields", fields);
        }
        if(isVirtual!=null){
            map.put("isVirtual", isVirtual);
        }
        return map;
    }
}
