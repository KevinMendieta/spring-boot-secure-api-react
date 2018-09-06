package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {

    private String name, author;
    private int priority;
    private Date dueDate;


    public Todo(){}

    public Todo(String name, String author, int priority, Date dueDate) {
        this.name = name;
        this.author = author;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
