package com.xinrenxinshi.domain.approval;

import java.util.List;

public class FlowSettingDetailResult {
  private List<FlowSettingGroupModel> fieldData;
  private List<FlowRelationFieldResult> relationMap;

  public List<FlowSettingGroupModel> getFieldData() {
    return fieldData;
  }

  public void setFieldData(List<FlowSettingGroupModel> fieldData) {
    this.fieldData = fieldData;
  }

  public List<FlowRelationFieldResult> getRelationMap() {
    return relationMap;
  }

  public void setRelationMap(List<FlowRelationFieldResult> relationMap) {
    this.relationMap = relationMap;
  }
}
