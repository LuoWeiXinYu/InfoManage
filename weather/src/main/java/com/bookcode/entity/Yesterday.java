package com.bookcode.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Yesterday implements Serializable {



    /**
     * 日期
     */
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 高温
     */
    private String high;

    /**
     * 风向
     */
    private String fx;

    /**
     * 低温
     */
    private String low;

    /**
     * 风力
     */
    private String fl;

    /**
     * 类型：大雨、多云、晴...
     */
    private String type;
}
