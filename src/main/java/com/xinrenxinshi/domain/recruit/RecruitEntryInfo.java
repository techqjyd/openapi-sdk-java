package com.xinrenxinshi.domain.recruit;


/**
 * <招聘入职信息>.
 *
 * @author peng cheng
 * @date 2019/10/17
 * @since
 */
public class RecruitEntryInfo {

    /**
     * 是否已入职
     */
    private String isEntry;
    /**
     * 实际入职日期
     */
    private String offerEntryTime;
    /**
     * 入职负责人
     */
    private String entryAccount;
    /**
     * 操作入职时间
     */
    private String entryOperatorTime;

    public String getIsEntry() {
        return isEntry;
    }

    public void setIsEntry(String isEntry) {
        this.isEntry = isEntry;
    }

    public String getOfferEntryTime() {
        return offerEntryTime;
    }

    public void setOfferEntryTime(String offerEntryTime) {
        this.offerEntryTime = offerEntryTime;
    }

    public String getEntryAccount() {
        return entryAccount;
    }

    public void setEntryAccount(String entryAccount) {
        this.entryAccount = entryAccount;
    }

    public String getEntryOperatorTime() {
        return entryOperatorTime;
    }

    public void setEntryOperatorTime(String entryOperatorTime) {
        this.entryOperatorTime = entryOperatorTime;
    }
}
