module com.arynd.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arynd.calcularedad to javafx.fxml;
    exports com.arynd.calcularedad;
}
