package com.xinrenxinshi.response;

/**
 * <员工成长记录 响应结果>.
 *
 * @author peng cheng
 * @date 2021/6/24
 * @since
 */
public class EmployeeCareersResponse {

    /**
     * 员工
     */
    private String employeeId;

    /**
     * 事件类型
     */
    private Integer type;

    /**
     * 时间
     */
    private Integer time;

    /**
     * 内容
     */
    private String content;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
