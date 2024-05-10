package com.xinrenxinshi.domain.apprisal;

import java.util.List;

public class ApprisalKpiTargetDetailModel {
    private String targetGroupId;
    private String targetId;
    private String targetName;
    List<ApprisalKpiTargetEntryFieldModel> entryFieldList;

    public String getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public List<ApprisalKpiTargetEntryFieldModel> getEntryFieldList() {
        return entryFieldList;
    }

    public void setEntryFieldList(List<ApprisalKpiTargetEntryFieldModel> entryFieldList) {
        this.entryFieldList = entryFieldList;
    }
}
