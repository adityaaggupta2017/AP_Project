package project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ExitController {

    @FXML
    private Label ExitLabel;

    public void exit(){
        System.exit(0);
    }

    public void dontExit(){

    }
}