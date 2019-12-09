package com.xinrenxinshi;

import com.xinrenxinshi.domain.AreaInfo;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.CityListRequest;
import com.xinrenxinshi.response.CityListResponse;
import com.xinrenxinshi.response.OpenapiTokenResponse;

import java.util.List;

/**
 * 公共service
 *
 * 1、获取access_token
 *
 * 2、获取城市列表
 *
 * @author: liuchenhui
 * @create: 2019-11-14 11:12
 **/
public abstract class XrxsCommonService {
    /**
     * access_token获取
     *
     * @return OpenapiTokenResponse
     */
    public static OpenapiTokenResponse getAccessToken() throws ApiException {
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        return instance.getToken();
    }


    /**
     * 获取城市列表
     *
     * @param access_token 授权token
     */
    public static List<AreaInfo> getCityList(String access_token) throws ApiException {
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        CityListRequest cityListRequest = new CityListRequest(access_token);
        CityListResponse response = instance.execute(cityListRequest);
        if (response != null && response.getErrcode() == 0) {
            return response.getAreaInfos();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }
}
