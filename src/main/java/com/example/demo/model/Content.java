package com.example.demo.model;

public class Content {

    private String id;
    private Category[] categories;

    public Content(String id, Category[] categories) {
        this.id = id;
        this.categories = categories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }
}
