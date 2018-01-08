package com.example.codeclan.todolistapp;

import java.io.Serializable;

/**
 * Created by Weasel on 08/01/2018.
 */

public class Task implements Serializable {

    private String title;
    private String description;
    private Category category;
    private Priority priority;
    private Boolean completed;

    public Task(String title, String description, Category category, Priority priority, Boolean completed){
        this.title = title;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.completed = completed;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
