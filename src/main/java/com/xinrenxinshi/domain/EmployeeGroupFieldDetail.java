package com.xinrenxinshi.domain;

import java.util.List;

/**
 * <分组字段信息>.
 *
 * @author peng cheng
 * @date 2020/9/27
 * @since
 */
public class EmployeeGroupFieldDetail {
    /**
     * 记录ID
     */
    private String recordId;

    /**
     * 是否可以编辑 true-1-可以，false-0-不可以
     */
    private Boolean editAble;

    /**
     * 字段信息
     */
    private List<EmployeeGroupRecordField> fields;

    public EmployeeGroupFieldDetail() {
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Boolean getEditAble() {
        return editAble;
    }

    public void setEditAble(Boolean editAble) {
        this.editAble = editAble;
    }

    public List<EmployeeGroupRecordField> getFields() {
        return fields;
    }

    public void setFields(List<EmployeeGroupRecordField> fields) {
        this.fields = fields;
    }
}
