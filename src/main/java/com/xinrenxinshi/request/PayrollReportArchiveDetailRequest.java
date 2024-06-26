package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PayrollReportArchiveDetailResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工资报表详情request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:16
 **/
public class PayrollReportArchiveDetailRequest extends AbstractOpenapiJsonRequest<PayrollReportArchiveDetailResponse> {
    /**
     * 查询的报表ID
     */
    private String reportId;
    /**
     * 查询的子报表ID
     */
    private String subReportId;

    /**
     * 非必填  审批状态 -1 未发起（包含撤销） 0审批中 1通过 2驳回   不传查询所有
     */
    private List<Integer> flowStatus;

    /**
     * 非必填  是否全部通过 0否  1是   传1则当月开启审批的情况下一旦不是最新归档的所有工资组都为通过状态的话则不返回数据   不传默认为否
     */
    private Integer allPassed ;

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

    public List<Integer> getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(List<Integer> flowStatus) {
        this.flowStatus = flowStatus;
    }

    public Integer getAllPassed() {
        return allPassed;
    }

    public void setAllPassed(Integer allPassed) {
        this.allPassed = allPassed;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("reportId", reportId);
        map.put("subReportId", subReportId);
        map.put("flowStatus", flowStatus);
        map.put("allPassed", allPassed);
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
        return "/v5/payroll/report/detail";
    }
}
