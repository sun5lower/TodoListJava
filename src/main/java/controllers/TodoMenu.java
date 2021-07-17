package controllers;

import javax.swing.*;
import java.util.Scanner;

public class TodoMenu {
    TodoController todoController = new TodoController();
    public void start(){
       showOptions();
       handleUserChoice();

    }
    private void handleUserChoice(){
            String userChoice = JOptionPane.showInputDialog("Choose an option");
            switch (userChoice){
                case "1":
                    todoController.addTodo();
                    break;
                    case "2":
                       todoController.viewAllTodo();
                        break;
                        case "3":
                            todoController.viewTodo();
                            break;
                            case "4":
                                todoController.removeTodo();
                                break;
                                case "5":
                                    todoController.updateTodo();
                                    break;
                                    case "6":
                                        System.exit(0);
                                        break;
                                        default:
                                            break;

            }
            start();
    }

    private void showOptions() {
        System.out.println(""
                + " Welcome to Todo Application"
                + "\n1. Add todo"
                + "\n2. View Todo List"
                        + "\n3. View Todo"
                + "\n4. Remove Todo List"
                + "\n5. Update Todo List"
                + "\n6. Exit Todo List"
        );

    }

}
