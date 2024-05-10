package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PayrollReportArchiveDetailResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 工资报表详情request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:16
 **/
public class PayrollReportArchiveDetailV2Request extends AbstractOpenapiJsonRequest<PayrollReportArchiveDetailResponse> {
    /**
     * 查询的报表ID
     */
    private String reportId;
    /**
     * 查询的子报表ID
     */
    private String subReportId;

    public PayrollReportArchiveDetailV2Request(String accessToken) {
        super(accessToken);
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getSubReportId() {
        return subReportId;
    }

    public void setSubReportId(String subReportId) {
        this.subReportId = subReportId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("reportId", reportId);
        map.put("subReportId", subReportId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PayrollReportArchiveDetailResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(reportId)) {
            throw new ParamNotValidException("查询的报表ID为空");
        }
//        if (XRXSStrUtils.isEmpty(subReportId)) {
//            throw new ParamNotValidException("查询的子报表ID为空");
//        }
    }

    @Override
    public TypeReference<OpenapiResponse<PayrollReportArchiveDetailResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PayrollReportArchiveDetailResponse>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/report/detail/v2";
    }
}
