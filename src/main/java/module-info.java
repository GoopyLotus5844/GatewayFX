module com.example.gatewayfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gateway.main to javafx.fxml;
    exports com.gateway.main;
}