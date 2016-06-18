package com.util.request;

/**
 * Created by tcwel on 2015/8/25 0025.
 */
public class BasicKeyValue {

    private String kev;
    private String value;

    public BasicKeyValue(String kev, String value) {
        this.kev = kev;
        this.value = value;
    }

    public String getKev() {
        return kev;
    }

    public void setKev(String kev) {
        this.kev = kev;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
