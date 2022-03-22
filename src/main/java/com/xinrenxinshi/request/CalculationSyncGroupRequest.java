package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.CalculationSyncGroupDataResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.*;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 4:19 下午
 * @desc  同步分组数据
 */
public class CalculationSyncGroupRequest  extends AbstractOpenapiJsonRequest<CalculationSyncGroupDataResponse> {

    private Integer groupId;

    private Integer yearmo;

    private LinkedList<LinkedHashMap<String, String>> data;


    public CalculationSyncGroupRequest(String accessToken) {
        super(accessToken);
    }


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getYearmo() {
        return yearmo;
    }

    public void setYearmo(Integer yearmo) {
        this.yearmo = yearmo;
    }

    public LinkedList<LinkedHashMap<String, String>> getData() {
        return data;
    }

    public void setData(LinkedList<LinkedHashMap<String, String>> data) {
        this.data = data;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String,Object> map = new HashMap<>(3);
        map.put("groupId",groupId);
        map.put("yearmo",yearmo);
        map.put("data",data);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<CalculationSyncGroupDataResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<CalculationSyncGroupDataResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<CalculationSyncGroupDataResponse>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if ( groupId==null || !XRXSStrUtils.isNumeric(groupId)) {
            throw new ParamNotValidException("分组id为空");
        }else if(yearmo==null || !XRXSStrUtils.isNumeric(yearmo)){
            throw new ParamNotValidException("年月为空");
        }else if(data==null || data.size()==0){
            throw new ParamNotValidException("字段数据为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/calculation/syncGroupData";
    }
}
