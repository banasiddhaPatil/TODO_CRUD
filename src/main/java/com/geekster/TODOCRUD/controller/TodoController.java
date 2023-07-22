package com.geekster.TODOCRUD.controller;

import com.geekster.TODOCRUD.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.geekster.TODOCRUD.service.TodoService;

import java.util.List;

@RestController
public class TodoController {
 @Autowired TodoService todoService;

 @GetMapping("/newTodo")
 public String addTodo(@RequestBody Todo todo){
   return todoService.addTodo(todo);
 }
 @DeleteMapping("/removeTodo")
 public String removeTodo(@RequestParam Integer todoId ){
     return todoService.removeTodo(todoId);
 }
 @GetMapping("/allTodos")
    public List<Todo> allTodos(){
     return todoService.todos();
 }
 @GetMapping("/todo{id}")
    public String getTodoBtId(@RequestParam Integer todoId){
     return todoService.getTodo(todoId);
 }
 @PutMapping("/todo/{todoId}/{status}")
    public String todoUpdate(@RequestParam Integer todoId, @RequestParam boolean status){
     return todoService.todoStatus(todoId,status);
 }
 @GetMapping("/doneTudos")
    public List<Todo> getDoneTodos(){
     return todoService.getDoneTodos();
 }
 @GetMapping("/undoneTodos")
    public List<Todo> getUndoneTodos(){
     return todoService.getUndoneTodos();
 }
}
