package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import lombok.Data;

/**
 * @author wangyuan
 * @date 2020/7/2 下午4:32
 */
@Data
public class OpenApiResponseAdapter<T> extends OpenapiResponse {
    /**
     * 结果数据
     */
    private T data;

}
