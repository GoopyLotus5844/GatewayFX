package com.gateway.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ToolbarController {
    public ToggleButton buttonSelect;
    public ToggleButton buttonPan;

    private MainController mainController;

    @FXML
    public void initialize(){
        ToggleGroup group = new ToggleGroup();
        buttonSelect.setToggleGroup(group);
        buttonPan.setToggleGroup(group);
        buttonSelect.setSelected(true);
    }

    public void addMain(MainController controller){
        mainController = controller;
    }

    public void onDelete(ActionEvent actionEvent) {
        mainController.drawThing(buttonSelect.isSelected());
    }
}
