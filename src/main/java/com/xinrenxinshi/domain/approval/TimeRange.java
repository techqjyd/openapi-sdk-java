package com.xinrenxinshi.domain.approval;

import java.util.List;

public class TimeRange {
        private Integer markId;
        private Integer eventDate;
        private int startTime;
        private int endTime;
        private List<MultipleRelaxTimeParam> multipleCustomRelaxDates;
        private String multipleRelaxTime;
        private int relaxStartDate;
        private int relaxEndDate;
        private String overtimeHour;
        private String overtimeDay;
        private String overtimeRatio;

        public Integer getMarkId() {
                return markId;
        }

        public void setMarkId(Integer markId) {
                this.markId = markId;
        }

        public Integer getEventDate() {
                return eventDate;
        }

        public void setEventDate(Integer eventDate) {
                this.eventDate = eventDate;
        }

        public int getStartTime() {
                return startTime;
        }

        public void setStartTime(int startTime) {
                this.startTime = startTime;
        }

        public int getEndTime() {
                return endTime;
        }

        public void setEndTime(int endTime) {
                this.endTime = endTime;
        }

        public List<MultipleRelaxTimeParam> getMultipleCustomRelaxDates() {
                return multipleCustomRelaxDates;
        }

        public void setMultipleCustomRelaxDates(List<MultipleRelaxTimeParam> multipleCustomRelaxDates) {
                this.multipleCustomRelaxDates = multipleCustomRelaxDates;
        }

        public String getMultipleRelaxTime() {
                return multipleRelaxTime;
        }

        public void setMultipleRelaxTime(String multipleRelaxTime) {
                this.multipleRelaxTime = multipleRelaxTime;
        }

        public int getRelaxStartDate() {
                return relaxStartDate;
        }

        public void setRelaxStartDate(int relaxStartDate) {
                this.relaxStartDate = relaxStartDate;
        }

        public int getRelaxEndDate() {
                return relaxEndDate;
        }

        public void setRelaxEndDate(int relaxEndDate) {
                this.relaxEndDate = relaxEndDate;
        }

        public String getOvertimeHour() {
                return overtimeHour;
        }

        public void setOvertimeHour(String overtimeHour) {
                this.overtimeHour = overtimeHour;
        }

        public String getOvertimeDay() {
                return overtimeDay;
        }

        public void setOvertimeDay(String overtimeDay) {
                this.overtimeDay = overtimeDay;
        }

        public String getOvertimeRatio() {
                return overtimeRatio;
        }

        public void setOvertimeRatio(String overtimeRatio) {
                this.overtimeRatio = overtimeRatio;
        }
}

