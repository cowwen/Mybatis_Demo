package com.cowwen.tutorial.demo.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: cowwen
 * Date: 14-1-21
 * Time: 上午11:30
 * To change this template use File | Settings | File Templates.
 */
public class Blog implements Serializable{

    private Long id;
    private String subject;
    private String content;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
