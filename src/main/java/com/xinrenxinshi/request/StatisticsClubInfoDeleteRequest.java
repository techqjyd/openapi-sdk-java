package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.statistic.ClueInfoDO;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 批量删除线索请求
 */
public class StatisticsClubInfoDeleteRequest extends AbstractOpenapiJsonRequest<Integer> {

    /**
     * 线索id
     */
    List<Long> clueInfoIdList;

    public StatisticsClubInfoDeleteRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("clueInfoIdList", clueInfoIdList);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Integer> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Integer>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Integer>>() {};
    }


    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/statistic/performance/clue/delete";
    }

    public List<Long> getClueInfoIdList() {
        return clueInfoIdList;
    }

    public void setClueInfoIdList(List<Long> clueInfoIdList) {
        this.clueInfoIdList = clueInfoIdList;
    }
}
