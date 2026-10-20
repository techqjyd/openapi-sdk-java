package com.xinrenxinshi.response;

import java.util.List;

public class PayrollEmployeePreBasePayFormResponse extends PayrollEmployeeBasePayFormResponse {

    /**
     * 奖金项
     */
    private List<CustomOptionDO> bonusList;               // 奖金
    /**
     * 成本项
     */
    private List<CustomOptionDO> costOptionList;     // 成本项
    /**
     * 调整项
     */
    private List<CustomOptionDO> adjustOptionList; // 调整项
    /**
     * 其他项（自定义字段）
     */
    private List<CustomPayrollFieldDO> customFieldList; // 自定义字段

    public List<CustomOptionDO> getBonusList() {
        return bonusList;
    }

    public void setBonusList(List<CustomOptionDO> bonusList) {
        this.bonusList = bonusList;
    }

    public List<CustomOptionDO> getCostOptionList() {
        return costOptionList;
    }

    public void setCostOptionList(List<CustomOptionDO> costOptionList) {
        this.costOptionList = costOptionList;
    }

    public List<CustomOptionDO> getAdjustOptionList() {
        return adjustOptionList;
    }

    public void setAdjustOptionList(List<CustomOptionDO> adjustOptionList) {
        this.adjustOptionList = adjustOptionList;
    }

    public List<CustomPayrollFieldDO> getCustomFieldList() {
        return customFieldList;
    }

    public void setCustomFieldList(List<CustomPayrollFieldDO> customFieldList) {
        this.customFieldList = customFieldList;
    }

    /**
     * 自定义字段
     */
    public static class CustomOptionDO {
        /**
         * 自定义工资项ID
         */
        private Integer id;
        /**
         * 自定义工资项名
         */
        private String name;
        /**
         * 自定义工资项值
         */
        private Double value;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }

    /**
     * 自定义字段
     */
    public static class CustomPayrollFieldDO {
        /**
         * 自定义字段ID
         */
        private String id;

        /**
         * 自定义字段名称
         */
        private String name;

        /**
         * 自定义字段类型 字段类型， 0-单行文本， 1-多行文本， 2-日期， 3-选项， 7-城市， 8-数值，
         */
        private int type;

        /**
         * 自定义字段值
         */
        private String value;

        /**
         * 选项类型数据源
         */
        private List<String> dataSource;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<String> getDataSource() {
            return dataSource;
        }

        public void setDataSource(List<String> dataSource) {
            this.dataSource = dataSource;
        }
    }
}