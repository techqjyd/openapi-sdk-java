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

    /**
     * 岗位自定义字段，key 为字段名称，value 为字段值；
     * 多选类型（fieldType=8）传 JSON 数组字符串，如 ["A","B"]；传空串表示清空该字段
     */
    private Map<String, String> customFields;


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("jobId",jobId);
        map.put("parentId", parentId);
        map.put("type", type);
        map.put("name", name);
        map.put("enName", enName);
        map.put("code", code);
        map.put("remark", remark);
        map.put("introduction", introduction);
        map.put("departmentIds", departmentIds);
        if (customFields != null && !customFields.isEmpty()) {
            map.put("customFields", customFields);
        }
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
