package com.xinrenxinshi.domain.login.param;

import com.xinrenxinshi.openapi.IParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangyuan
 * @date 2020/7/2 上午11:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileTokenParam implements IParam {
    /**
     * 免登手机号
     */
    private String mobile;
    /**
     * 身份类型，0员工，1管理员，2管理员优先
     */
    private Integer userType;

}
