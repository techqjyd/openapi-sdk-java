package com.xinrenxinshi.response;

import java.util.List;
import java.util.Map;

/**
 * 分组数据分页信息
 */
public class GroupDataInfo {

    private Integer groupId;
    private Map<String, String> headerMap;
    private List<Map<String, String>> groupData;
    private Integer totalPage;
    private Integer totalRow;

    /**
     * 获取分组ID
     * @return 分组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置分组ID
     * @param groupId 分组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取表头映射
     * @return 表头映射
     */
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    /**
     * 设置表头映射
     * @param headerMap 表头映射
     */
    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    /**
     * 获取分组数据行
     * @return 分组数据
     */
    public List<Map<String, String>> getGroupData() {
        return groupData;
    }

    /**
     * 设置分组数据行
     * @param groupData 分组数据
     */
    public void setGroupData(List<Map<String, String>> groupData) {
        this.groupData = groupData;
    }

    /**
     * 获取总页数
     * @return 总页数
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * 设置总页数
     * @param totalPage 总页数
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 获取总行数
     * @return 总行数
     */
    public Integer getTotalRow() {
        return totalRow;
    }

    /**
     * 设置总行数
     * @param totalRow 总行数
     */
    public void setTotalRow(Integer totalRow) {
        this.totalRow = totalRow;
    }
}