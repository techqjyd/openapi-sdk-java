package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.AreaInfo;

import java.util.List;

/**
 * 城市列表response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:57
 **/
public class CityListResponse{
    /**
     * 城市数据
     */
    private List<AreaInfo> areaInfos;

    public List<AreaInfo> getAreaInfos() {
        return areaInfos;
    }

    public void setAreaInfos(List<AreaInfo> areaInfos) {
        this.areaInfos = areaInfos;
    }
}
