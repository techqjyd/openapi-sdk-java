package com.xinrenxinshi.domain.approval;

/**
 * 审批文件信息
 *
 * @author: liuchenhui
 * @create: 2019-11-11 15:57
 **/
public class FlowFileInfo {
    /**
     * 文件名，仅当类型为文件是返回文件名
     */
    private String name;
    /**
     * 文件key
     */
    private String fileKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }
}
