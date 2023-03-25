package com.jairochaves.models;

public class MyMath {
    private final long id;
    private final String content;

    public MyMath(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
