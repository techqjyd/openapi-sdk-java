package com.xinrenxinshi.domain.recruit;

import lombok.Data;

/**
 * @Author zhaopc
 * @Date 2025/8/7
 * @Version 1.0.0
 * @Description
 */
@Data
public class RecruitmentAttachmentDO {
    /**
     *  附件的 key
     */
    private String fileKey;
    /**
     * 附件名称
     */
    private String fileName;
}
