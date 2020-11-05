package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
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
public class PayrollReportArchiveDetailRequest extends AbstractOpenapiRequest<PayrollReportArchiveDetailResponse> {
    /**
     * 查询的报表ID
     */
    private String reportId;
    /**
     * 查询的子报表ID
     */
    private String subReportId;

    public PayrollReportArchiveDetailRequest(String accessToken) {
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
        Map<String, Object> map = new HashMap<>();
        map.put("reportId", reportId);
        map.put("subReportId", subReportId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<PayrollReportArchiveDetailResponse> getResponseClass() {
        return PayrollReportArchiveDetailResponse.class;
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
    public String getBizUrl() {
        return "/v3/payroll/report/archive/detail";
    }
}
