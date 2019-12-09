package com.xinrenxinshi.domain.report;

/**
 * 描述：工资报表 基本信息
 *
 * @author jiazijie
 * @since 2019-01-16 下午3:25
 */
public class PayrollReportArchiveBase {
    /**
     * reportId-报表ID
     */
    private String reportId;

    /**
     * subReportId-子报表ID
     */
    private String subReportId;

    /**
     * reportName-报表名称
     */
    private String reportName;

    public PayrollReportArchiveBase(String reportId, String subReportId, String reportName) {
        this.reportId = reportId;
        this.subReportId = subReportId;
        this.reportName = reportName;
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

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }
}
