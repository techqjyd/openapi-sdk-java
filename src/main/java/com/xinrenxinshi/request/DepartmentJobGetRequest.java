package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.JobHeaderModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.DepartmentJobGetResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 岗位信息获取request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 11:48
 **/
public class DepartmentJobGetRequest extends AbstractOpenapiJsonRequest<List<JobHeaderModel>> {


    /**
     * 部门id，不传或者传空时，默认返回公司所有的岗位信息
     */
    private String departmentId;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentJobGetRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<JobHeaderModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /*
         * 无需参数检查
         */
    }

    @Override
    public TypeReference<OpenapiResponse<List<JobHeaderModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<JobHeaderModel>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/jobdictionary/list";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("departmentId", departmentId);
        return map;
    }
}
