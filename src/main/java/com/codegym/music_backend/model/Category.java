package com.codegym.music_backend.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCategory;
    public Category(){}

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
