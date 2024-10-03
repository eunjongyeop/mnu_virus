package com.example.virus.models;

public class Item {
    private String imageName;
    private String title;
    private String content;

    public Item(String imageName, String title, String content) {
        this.imageName = imageName;
        this.title = title;
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
