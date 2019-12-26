package com.xinrenxinshi.common;

import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.util.SecUtil;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工手机端免登request
 *
 * @author: liuchenhui
 * @create: 2019-11-06 18:49
 **/
public class FreeLoginParam {

    /**
     * 授权令牌
     */
    private String access_token;
    /**
     * xrxs员工ID，与第三方员工id，两者必传其一，需要单独加密，然后参与签名
     */
    private String employeeId;
    /**
     * 一次性token，需要单独加密，然后参与签名
     */
    private String freeLoginToken;
    /**
     * 跳转页面类型，默认跳转首页 1：审批列表 2：工资条列表 3：考勤列表 4：招聘列表 5：内容推荐 6：公告列表 7：我的团队 8：申请首页 9：发起人的审批详情页面 10：审批人或抄送人的审批详情页面
     */
    private RedirectUrlTypeEnum redirectUrlType;
    /**
     * 免登跳转相关参数，格式是json字符串。
     */
    private String redirectParam;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFreeLoginToken() {
        return freeLoginToken;
    }

    public void setFreeLoginToken(String freeLoginToken) {
        this.freeLoginToken = freeLoginToken;
    }

    public RedirectUrlTypeEnum getRedirectUrlType() {
        return redirectUrlType;
    }

    public void setRedirectUrlType(RedirectUrlTypeEnum redirectUrlType) {
        this.redirectUrlType = redirectUrlType;
    }

    public String getRedirectParam() {
        return redirectParam;
    }

    public void setRedirectParam(String redirectParam) {
        this.redirectParam = redirectParam;
    }

    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(access_token)) {
            throw new ParamNotValidException("access_token为空");
        }
        if (XRXSStrUtils.isEmpty(freeLoginToken)) {
            throw new ParamNotValidException("免登token为空");
        }
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("xrxs员工ID为空");
        }
    }

    public Map<String, Object> getParamMap() {
        Map<String, Object> map = new HashMap<>(10);

        map.put("access_token", access_token);
        map.put("token", freeLoginToken);
        map.put("employeeId", employeeId);

        if (redirectUrlType != null) {
            map.put("redirectUrlType", redirectUrlType.getRedirectUrlType());
        }
        if (!XRXSStrUtils.isEmpty(redirectParam)) {
            map.put("redirectParam", redirectParam);
        }

        Long timestamp = System.currentTimeMillis();
        map.put("timestamp", timestamp);
        map.put("sign", SecUtil.sign(map, XrxsOpenapiClient.getInstance().getAppSecret()));
        return map;
    }
}
