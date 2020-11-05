package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.CountryModel;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 国籍列表response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:57
 **/
public class CountryListResponse extends OpenapiResponse {
    /**
     * 国籍数据
     */
    private List<CountryModel> data;

    public List<CountryModel> getData() {
        return data;
    }

    public void setData(List<CountryModel> data) {
        this.data = data;
    }
}
