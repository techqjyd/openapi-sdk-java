package com.xinrenxinshi.domain.recruit;

import com.xinrenxinshi.domain.HeaderFieldInfo;
import java.util.LinkedList;
import java.util.List;

/**
 * <招聘报表数据>.
 *
 * @author peng cheng
 * @date 2019/10/16
 * @since
 */
public class RecruitReportInfo {

    /**
     * 报表头
     */
    private List<HeaderFieldInfo> reportHeader = new LinkedList<>();

    /**
     * 报表数据
     */
    private List<RecruitRecordInfo> reportData = new LinkedList<>();

    public List<HeaderFieldInfo> getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(List<HeaderFieldInfo> reportHeader) {
        this.reportHeader = reportHeader;
    }

    public List<RecruitRecordInfo> getReportData() {
        return reportData;
    }

    public void setReportData(List<RecruitRecordInfo> reportData) {
        this.reportData = reportData;
    }

    public RecruitReportInfo(RecruitRecordInfo.Builder builder) {
    }

    public RecruitReportInfo(List<HeaderFieldInfo> reportHeader, List<RecruitRecordInfo> reportData) {
        this.reportHeader = reportHeader;
        this.reportData = reportData;
    }

    public RecruitReportInfo() {
    }
}
