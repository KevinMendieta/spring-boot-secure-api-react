package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.persistence.todo.TodoPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api")
public class TodoController {

    @Autowired
    TodoPersistence todoPersistence;

    @RequestMapping(method = RequestMethod.GET , path = "/todos")
    public ResponseEntity<?> todos() {
        List<Todo> result = todoPersistence.getTodoList();
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }

}
