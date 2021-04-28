package com.xinrenxinshi.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @author by peilizhi
 * @date 2021/4/27 09:57
 * 考勤归档报表
 */
public class AttendanceReportData implements Serializable {
    /**
     * 归档编号，用于保证查询表报数据的一致性
     */
    private  String archiveId;

    /**
     * 归档时间
     */
    private Integer archiveTime;
    /**
     * 归档表报表头
     */
    private List<HeaderFieldInfo> reportHeader;
    /**
     * 归档表报数据
     */
    private List<HashMap<String, String>> reportData;

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public List<HeaderFieldInfo> getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(List<HeaderFieldInfo> reportHeader) {
        this.reportHeader = reportHeader;
    }

    public List<HashMap<String, String>> getReportData() {
        return reportData;
    }

    public void setReportData(List<HashMap<String, String>> reportData) {
        this.reportData = reportData;
    }
}
