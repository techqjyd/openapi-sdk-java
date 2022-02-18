package com.xinrenxinshi.domain.statistic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author panhuiwen
 * @Date 2021/10/21 15:56
 */
public class StatChartDataDO {
    private String time;
    private List<String> unit = new ArrayList();
    private List<List<String>> mutiDimension = new LinkedList();
    private List<String> dimension = new ArrayList();
    private List<String> metric = new ArrayList();
    private List<RatioDO> ratio = new ArrayList();
    private List<List<String>> data = new ArrayList();

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<String> getUnit() {
        return unit;
    }

    public void setUnit(List<String> unit) {
        this.unit = unit;
    }

    public List<List<String>> getMutiDimension() {
        return mutiDimension;
    }

    public void setMutiDimension(List<List<String>> mutiDimension) {
        this.mutiDimension = mutiDimension;
    }

    public List<String> getDimension() {
        return dimension;
    }

    public void setDimension(List<String> dimension) {
        this.dimension = dimension;
    }

    public List<String> getMetric() {
        return metric;
    }

    public void setMetric(List<String> metric) {
        this.metric = metric;
    }

    public List<RatioDO> getRatio() {
        return ratio;
    }

    public void setRatio(List<RatioDO> ratio) {
        this.ratio = ratio;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    public static class RatioDO {
        private String mom;
        private String yoy;

        public String getMom() {
            return mom;
        }

        public void setMom(String mom) {
            this.mom = mom;
        }

        public String getYoy() {
            return yoy;
        }

        public void setYoy(String yoy) {
            this.yoy = yoy;
        }
    }
}
