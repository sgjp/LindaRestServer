package com.jsanchez.entities;

/**
 * Created by jsanchez on 2017-03-21.
 */
public class Tuple {

    private String key;

    private String data;

    public Tuple(String key, String data) {
        this.key = key;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "key='" + key + '\'' +
                ", value='" + data + '\'' +
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
