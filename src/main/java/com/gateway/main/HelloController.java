package com.gateway.main;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    public Canvas canvas;

    @FXML
    public DraggableNode paneProperties;

    @FXML
    private ToggleButton buttonDelete;

    @FXML
    private Pane paneCenter;

    @FXML
    public void initialize(){
        System.out.println("Absolutely froggers");
        canvas.widthProperty().bind(paneCenter.widthProperty());
        canvas.heightProperty().bind(paneCenter.heightProperty());
    }

    @FXML
    protected void onDeleteButton(){
        System.out.println("Here");
        GraphicsContext g = canvas.getGraphicsContext2D();

        if(buttonDelete.isSelected()) g.setFill(Color.BLUE);
        else g.setFill(Color.RED);

        System.out.println(canvas.getWidth());
        g.fillOval(0, 0, 50, 50);
    }
}