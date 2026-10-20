module com.arynd.divisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arynd.divisores to javafx.fxml;
    exports com.arynd.divisores;
}
