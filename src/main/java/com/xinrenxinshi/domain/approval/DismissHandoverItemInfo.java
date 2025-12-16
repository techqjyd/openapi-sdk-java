package com.xinrenxinshi.domain.approval;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @Author panhuiwen
 * @Date 2022/1/13 11:13
 */
@Setter
@Getter
public class DismissHandoverItemInfo {
    private Integer handoverStatus;
    private String directorEmployeeId;
    private String directorEmployeeName;
    private String handoverItemContent;
    private String handoverRemark;
    private String handoverSituationContent;
    private String operationTime;
    private String transferExplain;
    private String transferToDirectorName;
    private String transferFromDirectorName;
    private Integer directorType;
    private String transferTime;
    private Integer myHandoverId;
    private List<Map<String, String>> handoverAttachments;

}
