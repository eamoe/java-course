package com.gb;

public class Pair {

    private int key;
    private String value;

    public Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }

    int getKey() {
        return key;
    }

    String getValue() {
        return value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
            "key=" + key +
            ", value='" + value + '\'' +
            '}';
    }
}
