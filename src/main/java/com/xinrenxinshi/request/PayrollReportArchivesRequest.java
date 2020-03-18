package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.PayrollReportArchivesResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 工资报表request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:01
 **/
public class PayrollReportArchivesRequest extends AbstractOpenapiRequest<PayrollReportArchivesResponse> {
    /**
     * 报表月份 yyyyMM
     */
    private String yearmo;

    public String getYearmo() {
        return yearmo;
    }

    public void setYearmo(String yearmo) {
        this.yearmo = yearmo;
    }

    public PayrollReportArchivesRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("yearmo", yearmo);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<PayrollReportArchivesResponse> getResponseClass() {
        return PayrollReportArchivesResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(yearmo)) {
            throw new ParamNotValidException("工资报表月份为空");
        }
        if (!XRXSDateUtils.isDateStr(yearmo, XRXSDateUtils.DATE_FORMAT_YEARMO)) {
            throw new ParamNotValidException("时间格式不符合yyyyMM的校验");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/payroll/report/archives";
    }

}
