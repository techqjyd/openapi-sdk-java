package com.xinrenxinshi.domain.approval;

import java.util.List;

/**
 * 审批详情
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:56
 **/
public class ProcessFlowInfo {
    /**
     * 审批基础数据
     */
    private ProcessBasicInfo processBasicInfo;
    /**
     * 审批表单数据
     */
    private List<ProcessFormGroupInfo> processMetaInfoList;

    public ProcessBasicInfo getProcessBasicInfo() {
        return processBasicInfo;
    }

    public void setProcessBasicInfo(ProcessBasicInfo processBasicInfo) {
        this.processBasicInfo = processBasicInfo;
    }

    public List<ProcessFormGroupInfo> getProcessMetaInfoList() {
        return processMetaInfoList;
    }

    public void setProcessMetaInfoList(List<ProcessFormGroupInfo> processMetaInfoList) {
        this.processMetaInfoList = processMetaInfoList;
    }
}
