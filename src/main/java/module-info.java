module com.example.gatewayfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gateway.main to javafx.fxml;
    exports com.gateway.main;
    exports com.gateway.controllers;
    opens com.gateway.controllers to javafx.fxml;
    exports com.gateway.nodes;
    opens com.gateway.nodes to javafx.fxml;
}