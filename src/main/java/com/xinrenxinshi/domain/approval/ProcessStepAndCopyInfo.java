package com.xinrenxinshi.domain.approval;

import java.util.List;

/**
 * 审批节点信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:21
 **/
public class ProcessStepAndCopyInfo {
    /**
     * 审批基础数据
     */
    private ProcessBasicInfo processBasicInfo;
    /**
     * 节点数据列表，列表顺序为节点顺序
     */
    private List<StepNodeInfo> stepNodeInfos;

    public ProcessBasicInfo getProcessBasicInfo() {
        return processBasicInfo;
    }

    public void setProcessBasicInfo(ProcessBasicInfo processBasicInfo) {
        this.processBasicInfo = processBasicInfo;
    }

    public List<StepNodeInfo> getStepNodeInfos() {
        return stepNodeInfos;
    }

    public void setStepNodeInfos(List<StepNodeInfo> stepNodeInfos) {
        this.stepNodeInfos = stepNodeInfos;
    }
}
