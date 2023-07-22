package com.geekster.TODOCRUD.service;

import com.geekster.TODOCRUD.repositroy.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.geekster.TODOCRUD.model.Todo;
import com.geekster.TODOCRUD.service.TodoService;


import java.util.List;

@Service
public class TodoService {
    @Autowired TodoRepo todoRepo;
    public String addTodo(Todo todo) {
        todoRepo.add(todo);
        return "Todo added";
    }

    public String removeTodo(Integer todoId) {
        for(Todo myTodo : todoRepo.getMyTodos()){
            if(myTodo.getTodoId().equals(todoId)){
                todoRepo.remove(myTodo);
                return "Todo Deleted ";
            }
        }
        return "Invalid todoId";
    }

    public List<Todo> todos() {
         return todoRepo.getMyTodos();
    }

    public String getTodo(Integer todoId) {
        for(Todo myTodo : todoRepo.getMyTodos()){
            if(myTodo.getTodoId().equals(todoId)){
                return "Todo found "+ myTodo;
            }
        }
        return "Invalid todoId";
    }

    public String todoStatus(Integer todoId, boolean status) {
        for(Todo myTodo : todoRepo.getMyTodos()){
            if(myTodo.getTodoId().equals(todoId)){
                myTodo.setTodoStatus(status);
                return "Todo status updated" ;
            }
        }
        return "Invalid todoId";
    }

    public List<Todo> getDoneTodos() {
        List<Todo> todos = null;
        for(Todo todo : todoRepo.getMyTodos()){
            if(todo.getTodoStatus()){
                todos.add(todo);
            }
        }
        return todos;
    }

    public List<Todo> getUndoneTodos() {
        List<Todo> todos = null;
        for(Todo todo : todoRepo.getMyTodos()){
            if(!todo.getTodoStatus()){
                todos.add(todo);
            }
        }
        return todos;
    }
}
