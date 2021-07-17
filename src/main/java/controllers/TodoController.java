package controllers;

import entity.Todo;
import repository.TodoToRepository;
import types.Status;

import javax.swing.*;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class TodoController {
    TodoToRepository todoRepository = new TodoToRepository();

    public void addTodo() {
        Todo todo = collectTodoInfo();
        try {
            todoRepository.addTodoDB(todo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //collect info
        //send to DB
    }

    private Todo collectTodoInfo() {
        Todo todo = new Todo();
        //setup what we need!!
        todo.setDescription(getUserInput("Description"));
        //needs try catch
        todo.setDueDate(Date.valueOf(getUserInput("Due Date (2021-07-26)")));
        todo.setDueTime(Time.valueOf(getUserInput("Due Time (20:20)") + ":00"));
        todo.setStatus(Status.PENDING);
        return todo;
    }

    private String getUserInput(String info) {
        return JOptionPane.showInputDialog("Enter" +info);

    }


    public void removeTodo(){

    }
    public void updateTodo(){

    }
    public void viewTodo(){
        ArrayList<Id> id = new ArrayList<Id>();

    }
    public void viewAllTodo(){
        ArrayList<Todo> todoList = new ArrayList<>();
        try {
           todoList = todoRepository.getAllTodoFromDB();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        displayTodoList(todoList);
    }
    private void displayTodoList(ArrayList<Todo> todoList){
        System.out.println("id \tstatus \tdue date & time \tdescription");
        todoList.forEach(System.out::println);
    }
}

