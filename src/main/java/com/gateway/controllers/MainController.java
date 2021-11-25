package com.gateway.controllers;

import com.gateway.main.DraggableNode;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class MainController {

    @FXML
    public Canvas canvas;

    @FXML
    public DraggableNode paneProperties;

    public SplitPane paneSplit;

    public ToolBar toolbar;

    @FXML
    private Pane paneCenter;

    @FXML
    private ToolbarController toolbarController;

    @FXML
    public void initialize(){
        System.out.println("Absolutely froggers");
        canvas.widthProperty().bind(paneCenter.widthProperty());
        canvas.heightProperty().bind(paneCenter.heightProperty());
        toolbarController.addMain(this);
    }

    public void drawThing(boolean active){
        System.out.println("Here");
        GraphicsContext g = canvas.getGraphicsContext2D();
        if(active) g.setFill(Color.BLUE);
        else g.setFill(Color.RED);
        System.out.println(canvas.getWidth());
        g.fillOval(0, 0, 50, 50);
        paneProperties.setLayoutX(paneCenter.getWidth() - paneProperties.getWidth());
    }

    public void finalGUISetup(){
        paneSplit.setDividerPosition(0, 0.15);
        paneProperties.setLayoutX(paneCenter.getWidth());
        System.out.println(canvas.getWidth());
    }
}