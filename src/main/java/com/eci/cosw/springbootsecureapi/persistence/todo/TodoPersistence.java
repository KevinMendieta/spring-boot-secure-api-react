package com.eci.cosw.springbootsecureapi.persistence.todo;

import com.eci.cosw.springbootsecureapi.model.Todo;

import java.util.List;

public interface TodoPersistence {

    List<Todo> getTodoList();

    Todo addTodo(Todo todo);

}
