package com.eci.cosw.springbootsecureapi.persistence.todo.impl;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.persistence.todo.TodoPersistence;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class InMemoryTodoPersistence implements TodoPersistence {

    List<Todo> todoList = new CopyOnWriteArrayList<>();

    public InMemoryTodoPersistence() {
        todoList.add(new Todo("Do things","", 5, new Date(System.currentTimeMillis())));
        todoList.add(new Todo("Do more things","", 5, new Date(System.currentTimeMillis())));
        todoList.add(new Todo("Do more & more things","", 5, new Date(System.currentTimeMillis())));
    }

    @Override
    public List<Todo> getTodoList() {
        return todoList;
    }

    @Override
    public Todo addTodo(Todo todo) {
        todoList.add(todo);
        return todo;
    }
}
