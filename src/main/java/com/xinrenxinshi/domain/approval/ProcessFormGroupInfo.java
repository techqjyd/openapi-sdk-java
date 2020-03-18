package com.xinrenxinshi.domain.approval;

import java.util.List;

/**
 * 审批表单数据
 *
 * @author: liuchenhui
 * @create: 2019-11-11 16:07
 **/
public class ProcessFormGroupInfo {
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 分组详情数据
     */
    private List<ProcessFormDetailInfo> detailInfos;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<ProcessFormDetailInfo> getDetailInfos() {
        return detailInfos;
    }

    public void setDetailInfos(List<ProcessFormDetailInfo> detailInfos) {
        this.detailInfos = detailInfos;
    }
}
