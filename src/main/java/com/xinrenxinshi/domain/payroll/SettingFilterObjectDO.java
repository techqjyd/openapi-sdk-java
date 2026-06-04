package com.xinrenxinshi.domain.payroll;

import java.io.Serializable;
import java.util.List;

/**
 * @author panhuiwen
 */
public class SettingFilterObjectDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;
    private String fieldName;
    private String field;
    private List<String> values;
    private List<ObjectScopes> useObject;
    private Object dataSource;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public List<ObjectScopes> getUseObject() {
        return useObject;
    }

    public void setUseObject(List<ObjectScopes> useObject) {
        this.useObject = useObject;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public void setDataSource(Object dataSource) {
        this.dataSource = dataSource;
    }
}
