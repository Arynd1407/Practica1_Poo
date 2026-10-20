module com.arynd.multiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arynd.multiplicar to javafx.fxml;
    exports com.arynd.multiplicar;
}
