package com.gateway.main;

import com.gateway.controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Gateway extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Gateway.class.getResource("/com/gateway/fxml/gateway.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/com/gateway/style/style.css").toExternalForm());
        stage.setTitle("GatewayFX");
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.setScene(scene);
        stage.show();
        ((MainController) loader.getController()).finalGUISetup();
    }

    public static void main(String[] args) {
        launch();
    }

    /*
    TODO
    Make properties box not draggable outside of canvas
    Figure out how to nest controllers
     */
}