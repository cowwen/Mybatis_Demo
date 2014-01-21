package com.cowwen.tutorial.demo.entity;

/**
 * Created with IntelliJ IDEA.
 * User: cowwen
 * Date: 14-1-21
 * Time: 下午6:08
 * To change this template use File | Settings | File Templates.
 */
public class BlogDetail {

    private Long id;
    private String subject;
    private String content;
    private Author author;

    public BlogDetail(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

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
