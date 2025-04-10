package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.approval.FlowGroupForOpenapiModel;

import java.util.List;

/**
 * @author 刘晨辉
 * @date 2025/4/10 下午2:58
 */
public class FlowSettingFormResult {
    private List<FlowGroupForOpenapiModel> groups;

    public List<FlowGroupForOpenapiModel> getGroups() {
        return groups;
    }

    public void setGroups(List<FlowGroupForOpenapiModel> groups) {
        this.groups = groups;
    }
}
