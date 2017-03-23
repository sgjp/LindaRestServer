package com.jsanchez.entities;

/**
 * Created by jsanchez on 2017-03-21.
 */
public class Tuple {

    private String key;

    private String value;

    public Tuple(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public Tuple() {

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
