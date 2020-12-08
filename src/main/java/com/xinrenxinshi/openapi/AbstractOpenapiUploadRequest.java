package com.xinrenxinshi.openapi;

import com.xinrenxinshi.util.FileItem;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传reqest
 *
 * @author: liuchenhui
 * @create: 2019-10-25 18:33
 **/
public abstract class AbstractOpenapiUploadRequest<T> extends AbstractOpenapiRequest<T> implements IOpenapiRequest<T> {

    /**
     * 文件流参数
     */
    private Map<String, FileItem> fileItemMap;

    private InputStream inputStream;

    private String fileName;

    public AbstractOpenapiUploadRequest(String accessToken) {
        super(accessToken);
    }

    public Map<String, FileItem> getFileItemMap() {
        return fileItemMap;
    }

    protected void setFileItemMap(Map<String, FileItem> fileItemMap) {
        this.fileItemMap = fileItemMap;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        if (!XRXSStrUtils.isEmpty(fileName)) {
            Map<String, FileItem> fileItemMap = new HashMap<>(10);
            FileItem fileItem = new FileItem(fileName, inputStream);
            fileItemMap.put("file", fileItem);
            this.setFileItemMap(fileItemMap);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        if (this.inputStream != null) {
            Map<String, FileItem> fileItemMap = new HashMap<>(10);
            FileItem fileItem = new FileItem(fileName, inputStream);
            fileItemMap.put("file", fileItem);
            this.setFileItemMap(fileItemMap);
        }
    }
}
