module com.arynd.gastosemanal {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arynd.gastosemanal to javafx.fxml;
    exports com.arynd.gastosemanal;
}
