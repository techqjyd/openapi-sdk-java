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
 *批量添加线索
 */
public class StatisticsClubInfoAddRequest extends AbstractOpenapiJsonRequest<Integer> {

    /**
     * 线索列表
     */
    List<ClueInfoDO> clueInfoList;

    public StatisticsClubInfoAddRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("clueInfoList", clueInfoList);
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
        return "/v5/statistic/performance/clue/add";
    }

    public List<ClueInfoDO> getClueInfoList() {
        return clueInfoList;
    }

    public void setClueInfoList(List<ClueInfoDO> clueInfoList) {
        this.clueInfoList = clueInfoList;
    }
}
