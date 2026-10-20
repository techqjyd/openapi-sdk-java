package com.xinrenxinshi.domain.payroll;

import java.io.Serializable;

/**
 * 项目事项 - 保存请求参数模型
 *
 * @author panhuiwen
 */
public class CostProjectAffairSaveParamModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
