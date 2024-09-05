package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author itar.deng
 * @version 1.0
 * @date 2024/8/29 14:39
 * @jdk 1.8
 * @description 更新选项openAPI入参
 **/
public class EmployeeFieldOptionUpdateRequest extends AbstractOpenapiJsonRequest<Void> {

    /**
     * 字段id
     */
    private String fieldId;
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段名称
     */
    private String labelName;

    /**
     * 选项数据
     */
    private List<Option> options;

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("fieldId", fieldId);
        map.put("fieldName", fieldName);
        map.put("labelName", labelName);
        map.put("options", options);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    public EmployeeFieldOptionUpdateRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(fieldId)) {
            throw new ParamNotValidException("字段id为空");
        }
        if (options == null) {
            throw new ParamNotValidException("字段选项值为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/field/option/update";
    }


    public static class Option {
        private List<Option> childOptionList;
        private String optionKey;
        private String optionValue;
        /**
         * 选项值-英文，可不填，默认和中文一样
         */
        private String optionEnValue;
        /**
         * 状态，0-启用，1-禁用
         */
        private Integer status;

        public String getOptionEnValue() {
            return optionEnValue;
        }

        public void setOptionEnValue(String optionEnValue) {
            this.optionEnValue = optionEnValue;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public List<Option> getChildOptionList() {
            return childOptionList;
        }

        public void setChildOptionList(List<Option> childOptionList) {
            this.childOptionList = childOptionList;
        }

        public String getOptionKey() {
            return optionKey;
        }

        public void setOptionKey(String optionKey) {
            this.optionKey = optionKey;
        }

        public String getOptionValue() {
            return optionValue;
        }

        public void setOptionValue(String optionValue) {
            this.optionValue = optionValue;
        }
    }


    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
