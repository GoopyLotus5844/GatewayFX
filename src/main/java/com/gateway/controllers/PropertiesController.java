package com.gateway.controllers;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class PropertiesController {

    public Text textCounter;
    private int counter = 1;

    public void buttonCool(ActionEvent actionEvent) {
        counter++;
        textCounter.setText(Integer.toString(counter));
    }
}
