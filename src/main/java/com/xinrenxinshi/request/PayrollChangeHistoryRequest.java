package com.xinrenxinshi.request;

import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.PayrollChangeHistoryResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 调薪记录查询request
 *
 * @author: liuchenhui
 * @create: 2019-11-28 10:22
 **/
public class PayrollChangeHistoryRequest extends AbstractOpenapiRequest<PayrollChangeHistoryResponse> {

    /**
     * 页数
     */
    private Integer pageNo;
    /**
     * 每页条数，1~100页之间，默认每页50条
     */
    private Integer pageSize;
    /**
     * 开始时间，时间格式yyyy-MM-dd
     */
    private String beginTime;
    /**
     * 结束时间，时间格式yyyy-MM-dd
     */
    private String endTime;

    public PayrollChangeHistoryRequest(String accessToken) {
        super(accessToken);
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

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        map.put("beginTime", beginTime);
        map.put("endTime", endTime);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<PayrollChangeHistoryResponse> getResponseClass() {
        return PayrollChangeHistoryResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(beginTime) || !XRXSDateUtils.isDateStr(beginTime, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("开始时间为空或者不符合yyyy-MM-dd的校验");
        }
        if (XRXSStrUtils.isEmpty(endTime) || !XRXSDateUtils.isDateStr(endTime, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("结束时间为空或者不符合yyyy-MM-dd的校验");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/payroll/change/history";
    }
}
