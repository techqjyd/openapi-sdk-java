package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 3:23 下午
 * @desc
 */
public class CalculationCompanyGroupV2Response extends OpenapiResponse {

    /**
     * 组
     */
    private List<CalculationCompanyGroupResponse> groups;

    /**
     *    同步数据key  (每次调用接口 都会生成一个最新的 如果想多次同步数据自行保存) 如 一次性想全量同步3w条数据 每次同步3000的话 则10次使用同一个syncKey
     * @param 都会生成一个最新的
     */
    private String syncKey;


    public List<CalculationCompanyGroupResponse> getGroups() {
        return groups;
    }

    public void setGroups(List<CalculationCompanyGroupResponse> groups) {
        this.groups = groups;
    }

    public String getSyncKey() {
        return syncKey;
    }

    public void setSyncKey(String syncKey) {
        this.syncKey = syncKey;
    }
}
