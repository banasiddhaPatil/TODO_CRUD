package com.geekster.TODOCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Integer todoId;
    private  String todoName;
    private boolean todoStatus;

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }
    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(Integer todoId) {
        this.todoName = todoName;
    }
    public boolean getTodoStatus(){
        return todoStatus;
    }
    public void setTodoStatus(boolean todoStatus){
        this.todoStatus = todoStatus;
    }
}
