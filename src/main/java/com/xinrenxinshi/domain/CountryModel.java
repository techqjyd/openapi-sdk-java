package com.xinrenxinshi.domain;

/**
 * 获取国家列表
 *
 * @author zhaopengcheng
 */
public class CountryModel {

    /**
     * 国家对应ID
     */
    private Integer id;
    /**
     * 国家对应name
     */
    private String name;

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
}
