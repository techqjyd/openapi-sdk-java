package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.domain.log.AdminOperationLogResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

import static com.xinrenxinshi.common.Constants.LIMIT_NUMBER_PAGES;

public class AdminOperationLogRequest extends AbstractOpenapiJsonRequest<PageResult<AdminOperationLogResult>> {

    private Integer pageNo;
    private Integer pageSize;
    private Integer startTime;
    private Integer endTime;
    private String accountId;
    private String moduleCode;
    private String keyword;

    public AdminOperationLogRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        if (!XRXSStrUtils.isEmpty(accountId)) {
            map.put("accountId", accountId);
        }
        if (!XRXSStrUtils.isEmpty(moduleCode)) {
            map.put("moduleCode", moduleCode);
        }
        if (!XRXSStrUtils.isEmpty(keyword)) {
            map.put("keyword", keyword);
        }
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<AdminOperationLogResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<AdminOperationLogResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<AdminOperationLogResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (pageNo == null) {
            throw new ParamNotValidException("起始页码为空");
        }
        if (pageSize == null || pageSize > LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("pageSize为空或者数量超过100");
        }

    }

    @Override
    public String getBizUrl() {
        return "/v5/log/admin/operation/list";
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
