package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class DepartmentJobAddRequest extends AbstractOpenapiJsonRequest<String> {

    public DepartmentJobAddRequest(String accessToken) {
        super(accessToken);
    }

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
     * 岗位英文名
     */

    private String enName;

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


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("parentId", parentId);
        map.put("type", type);
        map.put("name", name);
        map.put("code", code);
        map.put("remark", remark);
        map.put("introduction", introduction);
        map.put("enName", enName);
        map.put("departmentIds", departmentIds);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(parentId)) {
            throw new ParamNotValidException("parentId为空");
        }
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("name为空");
        }
        if (type == null) {
            throw new ParamNotValidException("type为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/jobdictionary/add";
    }
}
