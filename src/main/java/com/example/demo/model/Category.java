package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    private String id;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category motherCategory;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Category> sonsCategory;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Content> contents;

    public Category() {
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
