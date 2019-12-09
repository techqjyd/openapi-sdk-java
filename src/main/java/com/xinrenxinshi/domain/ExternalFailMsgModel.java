package com.xinrenxinshi.domain;

/**
 * <一句话描述> <详细介绍>
 *
 * @author Shi Yang
 * @since 需求wiki
 */
public class ExternalFailMsgModel {
    private int pushType;
    private String pushMessage;
    private int sendtime;

    public ExternalFailMsgModel() {
    }

    public int getPushType() {
        return pushType;
    }

    public void setPushType(int pushType) {
        this.pushType = pushType;
    }

    public String getPushMessage() {
        return pushMessage;
    }

    public void setPushMessage(String pushMessage) {
        this.pushMessage = pushMessage;
    }

    public int getSendtime() {
        return sendtime;
    }

    public void setSendtime(int sendtime) {
        this.sendtime = sendtime;
    }
}
