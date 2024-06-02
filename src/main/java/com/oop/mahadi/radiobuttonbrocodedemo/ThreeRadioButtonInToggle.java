package com.oop.mahadi.radiobuttonbrocodedemo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
public class ThreeRadioButtonInToggle {
    @javafx.fxml.FXML
    private RadioButton RadioButton1Fxid;
    @javafx.fxml.FXML
    private ToggleGroup RadioToggle123;
    @javafx.fxml.FXML
    private Label LavelTextFild;
    @javafx.fxml.FXML
    private RadioButton RadioButton2Fxid;
    @javafx.fxml.FXML
    private RadioButton RadioButton3Fxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RadioButton1OnAction(ActionEvent actionEvent) {
//        LavelTextFild.setText(RadioButton1Fxid.getText());
        LavelTextFild.setText("R 1");
    }


    @javafx.fxml.FXML
    public void RadioButton2OnAction(ActionEvent actionEvent) {
        LavelTextFild.setText("R 2");
    }

    @javafx.fxml.FXML
    public void RadioButton3OnAction(ActionEvent actionEvent) {
        LavelTextFild.setText("R 3");
    }
}