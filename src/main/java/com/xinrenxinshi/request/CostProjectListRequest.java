package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.payroll.CostProjectModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目列表查询request
 *
 * @author panhuiwen
 */
public class CostProjectListRequest extends AbstractOpenapiJsonRequest<PageResult<CostProjectModel>> {

    private String name;
    private Integer status;
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    private Integer systemType;
    private String employeeId;

    public CostProjectListRequest(String accessToken) {
        super(accessToken);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("name", name);
        map.put("status", status);
        map.put("pageNum", pageNum);
        map.put("pageSize", pageSize);
        map.put("systemType", systemType);
        map.put("employeeId", employeeId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<CostProjectModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<CostProjectModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<CostProjectModel>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/cost/project/list";
    }
}
