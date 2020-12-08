package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.EmployeeFileDownloadResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工文件下载request
 *
 * @author: liuchenhui
 * @create: 2019-11-13 16:18
 **/
public class EmployeeFileDownloadRequest extends AbstractOpenapiJsonRequest<EmployeeFileDownloadResponse> {
    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 文件key
     */
    private String fileKey;

    public EmployeeFileDownloadRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        map.put("fileKey", fileKey);
        return map;
    }

    @Override
    public TypeReference<OpenapiResponse<EmployeeFileDownloadResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<EmployeeFileDownloadResponse>>() {
        };
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<EmployeeFileDownloadResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID为空");
        }
        if (XRXSStrUtils.isEmpty(fileKey)) {
            throw new ParamNotValidException("文件key为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/file/download";
    }
}
