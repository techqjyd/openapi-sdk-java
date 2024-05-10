package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 工资报表详情response
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:16
 **/
public class PayrollReportArchiveDetailResponse {
    /**
     * 当前报表包含的记录数
     */
    private Integer totalRow;
    /**
     * 当前报表归档完成时间
     */
    private String archiveTime;
    /**
     * 当前报表名称
     */
    private String reportName;
    /**
     * 当前报表的报表头信息列表
     */
    private List<String> reportHeadList;
    /**
     * 当前报表的所有数据信息列表
     */
    private List<List<String>> reportDetailList;

    public Integer getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(Integer totalRow) {
        this.totalRow = totalRow;
    }

    public String getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(String archiveTime) {
        this.archiveTime = archiveTime;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public List<String> getReportHeadList() {
        return reportHeadList;
    }

    public void setReportHeadList(List<String> reportHeadList) {
        this.reportHeadList = reportHeadList;
    }

    public List<List<String>> getReportDetailList() {
        return reportDetailList;
    }

    public void setReportDetailList(List<List<String>> reportDetailList) {
        this.reportDetailList = reportDetailList;
    }
}
