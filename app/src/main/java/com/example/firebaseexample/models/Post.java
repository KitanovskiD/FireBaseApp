package com.example.firebaseexample.models;

public class Post {

    private String userId;
    private String title;
    private String description;

    public Post() {
    }

    public Post(String userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
