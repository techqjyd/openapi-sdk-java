package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeIdQueryRequest extends AbstractOpenapiJsonRequest<Map<String,String>> {

    public EmployeeIdQueryRequest(String accessToken) {
        super(accessToken);
    }
    /**
     * 唯一键列表
     */
    private List<String> unionKeyList;
    /**
     * 员工状态，默认为0。0:在职员工、1:离职员工
     */
    private Integer status;
    /**
     * 唯一键类型，0：手机号，1：邮箱
     */
    private String type;

    public List<String> getUnionKeyList() {
        return unionKeyList;
    }

    public void setUnionKeyList(List<String> unionKeyList) {
        this.unionKeyList = unionKeyList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("unionKeyList", unionKeyList);
        map.put("status", status);
        map.put("type", type);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Map<String,String>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Map<String, String>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Map<String, String>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (unionKeyList == null) {
            throw new ParamNotValidException("唯一键列表为空");
        }

        if (type == null) {
            throw new ParamNotValidException("唯一键类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/getId";
    }
}
