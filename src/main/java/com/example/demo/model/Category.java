package com.example.demo.model;

import java.util.Set;

public class Category {

    private String id;
    private Category motherCategory;
    private Set<Category> sonsCategory;
    private Set<Content> contents;

    public Category(String id, Category motherCategory, Set<Category> sonsCategory, Set<Content> contents) {
        this.id = id;
        this.motherCategory = motherCategory;
        this.sonsCategory = sonsCategory;
        this.contents = contents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category getMotherCategory() {
        return motherCategory;
    }

    public void setMotherCategory(Category motherCategory) {
        this.motherCategory = motherCategory;
    }

    public Set<Category> getSonsCategory() {
        return sonsCategory;
    }

    public void setSonsCategory(Set<Category> sonsCategory) {
        this.sonsCategory = sonsCategory;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }
}
