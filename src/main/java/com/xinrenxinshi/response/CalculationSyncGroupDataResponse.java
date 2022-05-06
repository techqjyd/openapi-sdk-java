package com.xinrenxinshi.response;


import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.Collections;
import java.util.List;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 3:28 下午
 * @desc
 */
public class CalculationSyncGroupDataResponse extends OpenapiResponse {

    /**
     * 操作是否成功
     */
    private Boolean isSuccess;

    /**
     * 错误内容
     */
    private List<String> errors;

    /**
     * 异常类型  1操作异常  2数据异常
     */
    private Integer errorType = 0;

    public static CalculationSyncGroupDataResponse success(){
        CalculationSyncGroupDataResponse result = new CalculationSyncGroupDataResponse();
        result.setSuccess(true);
        return result;
    }

    public static CalculationSyncGroupDataResponse dataError(List<String> errors){
        CalculationSyncGroupDataResponse result = new CalculationSyncGroupDataResponse();
        result.setSuccess(false);
        result.setErrors(errors);
        result.setErrorType(2);
        return result;
    }

    public static CalculationSyncGroupDataResponse operatorError(String error) {
        CalculationSyncGroupDataResponse result = new CalculationSyncGroupDataResponse();
        result.setSuccess(false);
        List<String> errors = Collections.singletonList(error);
        result.setErrors(errors);
        result.setErrorType(1);
        return result;
    }


    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Integer getErrorType() {
        return errorType;
    }

    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }
}
