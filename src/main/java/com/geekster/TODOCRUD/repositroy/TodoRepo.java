package com.geekster.TODOCRUD.repositroy;

import com.geekster.TODOCRUD.model.Todo;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepo {

    private List<Todo> myTodos;

    public List<Todo> getMyTodos() {
        return myTodos;
    }


    public void remove(Todo todo) {
        myTodos.remove(todo);
    }

    public void add(Todo todo) {
        myTodos.add(todo);
    }
}
