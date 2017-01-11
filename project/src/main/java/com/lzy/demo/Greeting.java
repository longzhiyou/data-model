package com.lzy.demo;

/**
 * User: longzhiyou
 * Date: 2016/11/4
 * Time: 13:33
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
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
