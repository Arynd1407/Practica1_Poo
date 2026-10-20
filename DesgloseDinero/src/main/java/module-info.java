module com.arynd.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arynd.desglosedinero to javafx.fxml;
    exports com.arynd.desglosedinero;
}
