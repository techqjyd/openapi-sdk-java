package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.report.PayrollReportArchiveBase;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 工资报表response
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:02
 **/
public class PayrollReportArchivesResponse extends OpenapiResponse {
    /**
     * 薪酬报表ID
     */
    private String archiveId;

    /**
     * 当前报表归档完成时间 yyyy-mm-dd hh:mm:ss
     */
    private String archiveTime;

    /**
     * name-薪酬报表名称
     */
    private String archiveName;

    /**
     * yearmo-报表周期
     */
    private String yearmo;

    /**
     * 报表信息
     */
    private List<PayrollReportArchiveBase> archiveReportList;

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public String getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(String archiveTime) {
        this.archiveTime = archiveTime;
    }

    public String getArchiveName() {
        return archiveName;
    }

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    public String getYearmo() {
        return yearmo;
    }

    public void setYearmo(String yearmo) {
        this.yearmo = yearmo;
    }

    public List<PayrollReportArchiveBase> getArchiveReportList() {
        return archiveReportList;
    }

    public void setArchiveReportList(List<PayrollReportArchiveBase> archiveReportList) {
        this.archiveReportList = archiveReportList;
    }
}
