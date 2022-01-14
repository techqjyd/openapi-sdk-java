package com.xinrenxinshi.domain.recruit;

/**简历附件对象
 * @author hzz on 2022/01/14
 */
public class RecruitmentResumeAttachmentModel {
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 文件地址
     */
    private String fileUrl;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

}
