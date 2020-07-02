package com.xinrenxinshi.domain.login.param;

import com.xinrenxinshi.openapi.IParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangyuan
 * @date 2020/7/2 下午4:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileLoginParam implements IParam {
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 免登token
     */
    private String token;
    /**
     * 身份类型，0员工，1管理员，2管理员优先
     */
    private Integer userType;
    /**
     * 免登跳转类型
     */
    private Integer redirectUrlType;
    /**
     * 免登跳转参数
     */
    private String redirectParam;
    /**
     * 授权令牌
     */
    private String access_token;
}
