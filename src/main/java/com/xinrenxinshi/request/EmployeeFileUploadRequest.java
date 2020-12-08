package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiUploadRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.EmployeeFileUploadResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工文件上传请求参数
 *
 * @author: liuchenhui
 * @create: 2019-11-05 12:09
 **/
public class EmployeeFileUploadRequest extends AbstractOpenapiUploadRequest<EmployeeFileUploadResponse> {

    /**
     * 员工ID
     */
    private String employeeId;

    public EmployeeFileUploadRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public TypeReference<OpenapiResponse<EmployeeFileUploadResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<EmployeeFileUploadResponse>>() {
        };
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<EmployeeFileUploadResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工id为空");
        }
        if (XRXSStrUtils.isEmpty(this.getFileName())) {
            throw new ParamNotValidException("文件名称为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/file/upload";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        return map;
    }
}
