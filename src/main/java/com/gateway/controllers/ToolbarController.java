package com.gateway.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ToolbarController {
    public ToggleButton buttonSelect;
    public ToggleButton buttonPan;

    private GatewayController gatewayController;

    @FXML
    public void initialize(){
        ToggleGroup group = new ToggleGroup();
        buttonSelect.setToggleGroup(group);
        buttonPan.setToggleGroup(group);
    }

    public void addGateway(GatewayController controller){
        gatewayController = controller;
    }

    public void onDelete(ActionEvent actionEvent) {
        gatewayController.drawThing(buttonSelect.isSelected());
    }
}
