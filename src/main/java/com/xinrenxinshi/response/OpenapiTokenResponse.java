package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * OpenapiTokenResponse
 *
 * @author: liuchenhui
 * @create: 2019-10-30 17:42
 **/
public class OpenapiTokenResponse extends OpenapiResponse {
    /**
     * 令牌
     */
    private String access_token;

    /**
     * 令牌类型
     */
    private String token_type;

    /**
     * 有效时间
     */
    private Integer expires_in;

    /**
     * 授权作用域
     */
    private String scope;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpenapiTokenResponse that = (OpenapiTokenResponse) o;

        if (!access_token.equals(that.access_token)) return false;
        if (!token_type.equals(that.token_type)) return false;
        if (!expires_in.equals(that.expires_in)) return false;
        return scope.equals(that.scope);

    }

    @Override
    public int hashCode() {
        int result = access_token.hashCode();
        result = 31 * result + token_type.hashCode();
        result = 31 * result + expires_in.hashCode();
        result = 31 * result + scope.hashCode();
        return result;
    }
}
