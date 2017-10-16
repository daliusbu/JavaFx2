package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label myLabel;
    @FXML
    private TextField nameInput;




    public void changeText(ActionEvent event) {
    String temp = myLabel.getText();
    String name = nameInput.getText();
    myLabel.setText(temp + " " + name);
    }
}
