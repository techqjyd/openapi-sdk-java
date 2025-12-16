package com.xinrenxinshi.domain.approval;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 离职交接详情
 * @Author panhuiwen
 * @Date 2022/1/13 11:11
 */
@Setter
@Getter
public class DismissHandoverDetailInfo {
    private List<DismissHandoverDetailBasicFieldInfo> basicFields;
    private List<List<DismissHandoverClassifyInfo>> steps;
    private DismissHandoverBasicInfo handoverBasic;
    private List<DismissHandoverOperationItemInfo> dimissionOperationList;
    private Integer launchHandoverStatus;
    private String ownerId;
    private String mobile;
    private String applyTime;
    private String dimissionTime;
    private String flowNumber;
    private String jobNumber;
    private Integer id;
    private String url;

}
