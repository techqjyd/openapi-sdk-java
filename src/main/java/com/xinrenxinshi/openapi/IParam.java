package com.xinrenxinshi.openapi;

import com.xinrenxinshi.util.ParamUtil;

import java.util.Map;

/**
 * @author wangyuan
 * @date 2020/7/2 下午3:44
 */
public interface IParam {
    /**
     * 参数校验
     */
    default void check() {
    }


    /**
     * 获取参数map
     *
     * @return 参数map
     */
    default Map<String, Object> getParamMap() {
        return ParamUtil.buildParam(this);
    }
}
