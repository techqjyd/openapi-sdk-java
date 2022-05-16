package com.xinrenxinshi.domain.approval;

public class AmountWordResult {
    private Integer isUpperCaseNumber;//是否展示大写数字 0：不展示 1：展示
    private Integer isThousandsSeparator;//是否展示千位分隔位 0：不展示 1：展示
    private Integer isDecimalPlaces;//是否展示小数位 0：不展示 1：展示
    private Integer digits;//位数

    public Integer getIsUpperCaseNumber() {
        return isUpperCaseNumber;
    }

    public void setIsUpperCaseNumber(Integer isUpperCaseNumber) {
        this.isUpperCaseNumber = isUpperCaseNumber;
    }

    public Integer getIsThousandsSeparator() {
        return isThousandsSeparator;
    }

    public void setIsThousandsSeparator(Integer isThousandsSeparator) {
        this.isThousandsSeparator = isThousandsSeparator;
    }

    public Integer getIsDecimalPlaces() {
        return isDecimalPlaces;
    }

    public void setIsDecimalPlaces(Integer isDecimalPlaces) {
        this.isDecimalPlaces = isDecimalPlaces;
    }

    public Integer getDigits() {
        return digits;
    }

    public void setDigits(Integer digits) {
        this.digits = digits;
    }
}
