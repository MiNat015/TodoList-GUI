package com.arjun.todolist;

import com.arjun.todolist.datamodel.TodoData;
import com.arjun.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionTextField;

    @FXML
    private TextArea detailsTextField;

    @FXML
    private DatePicker deadlineField;


    public TodoItem processResults(){
        String shorDescription = shortDescriptionTextField.getText().trim();
        String details = detailsTextField.getText().trim();
        LocalDate deadline = deadlineField.getValue();


        TodoItem newItem = new TodoItem(shorDescription,details,deadline);

        TodoData.getInstance().addTodoItem(newItem);
        return newItem;

    }
}
