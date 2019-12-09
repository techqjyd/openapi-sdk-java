package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
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
public class EmployeeFileDownloadRequest extends AbstractOpenapiRequest<EmployeeFileDownloadResponse> {
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
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<EmployeeFileDownloadResponse> getResponseClass() {
        return EmployeeFileDownloadResponse.class;
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
        return "/v3/employee/downloadFile";
    }
}
