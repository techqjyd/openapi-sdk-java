package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.AttendanceReportData;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ReportPageResult;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by peilizhi
 * @date 2021/4/27 09:48
 */
public class AttendanceReportSearchRequest extends AbstractOpenapiJsonRequest<ReportPageResult<AttendanceReportData>> {

    private String archiveDate;

    private Integer reportType;

    /**
     * 查询页码，不传默认从0开始
     */
    private Integer pageNo = 0;

    /**
     * 每页大小，不传默认最大100个
     */
    private Integer pageSize = 100;

    public AttendanceReportSearchRequest(String accessToken) {
        super(accessToken);
    }

    public String getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(String archiveDate) {
        this.archiveDate = archiveDate;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
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


    /**
     * 各业务参数
     */
    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("archiveDate", archiveDate);
        map.put("reportType", reportType);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        return map;
    }

    /**
     * 获取请求方法
     */
    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    /**
     * 获取返回参数的class
     */
    @Override
    public OpenapiResponse<ReportPageResult<AttendanceReportData>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    /**
     * 获取返回参数类型
     *
     * @return 这个必须重写，
     */
    @Override
    public TypeReference<OpenapiResponse<ReportPageResult<AttendanceReportData>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ReportPageResult<AttendanceReportData>>>() {
        };
    }

    /**
     * 参数前置检查
     */
    @Override
    public void check() throws ParamNotValidException {
        if (null == reportType) {
            throw new ParamNotValidException("考勤报表类型为空");
        }
    }

    /**
     * 获取业务url
     */
    @Override
    public String getBizUrl() {
        return "/v5/attendance/report/detail";
    }
}
