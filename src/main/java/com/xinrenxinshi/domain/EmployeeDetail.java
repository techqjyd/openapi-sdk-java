package com.xinrenxinshi.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * <一句话描述> <详细介绍>
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:51
 **/
public class EmployeeDetail extends EmployeeSimple {


    /**
     * 离职类型，0表示主动离职,1表示被动离职,2表示退休
     */
    private Integer dismissionType;
    /**
     * 离职原因
     */
    private String dismissionReason;
    /**
     * 离职日期
     */
    private String dismissionDate;

    private Map<String, String> fields = new HashMap<>(10);

    public Integer getDismissionType() {
        return dismissionType;
    }

    public void setDismissionType(Integer dismissionType) {
        this.dismissionType = dismissionType;
    }

    public String getDismissionReason() {
        return dismissionReason;
    }

    public void setDismissionReason(String dismissionReason) {
        this.dismissionReason = dismissionReason;
    }

    public String getDismissionDate() {
        return dismissionDate;
    }

    public void setDismissionDate(String dismissionDate) {
        this.dismissionDate = dismissionDate;
    }

    public Map<String, String> getFields() {
        return fields;
    }

    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }
}
