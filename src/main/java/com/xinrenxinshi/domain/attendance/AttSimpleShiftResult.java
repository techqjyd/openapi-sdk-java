package com.xinrenxinshi.domain.attendance;

import java.util.List;

public class AttSimpleShiftResult {
    private Long id;
    private String name;
    private List<AttSimpleShiftRangeResult> clockTimeRanges;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AttSimpleShiftRangeResult> getClockTimeRanges() {
        return clockTimeRanges;
    }

    public void setClockTimeRanges(List<AttSimpleShiftRangeResult> clockTimeRanges) {
        this.clockTimeRanges = clockTimeRanges;
    }
}
