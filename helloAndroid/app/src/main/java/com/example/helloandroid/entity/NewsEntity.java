package com.example.helloandroid.entity;

public class NewsEntity {
    private String title;
    private String content;
    private int aIcon;

    public NewsEntity() {
    }

    public NewsEntity(String title, String content, int aIcon) {
        this.title = title;
        this.content = content;
        this.aIcon = aIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getIcon() {
        return aIcon;
    }

    public void setIcon(int aIcon) {
        this.aIcon = aIcon;
    }
}

