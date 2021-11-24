package com.gateway.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ToolbarController {
    public ToggleButton buttonSelect;
    public ToggleButton buttonPan;

    @FXML
    public void initialize(){
        ToggleGroup group = new ToggleGroup();
        buttonSelect.setToggleGroup(group);
        buttonPan.setToggleGroup(group);
    }

}
