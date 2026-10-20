package com.arynd.gastosemanal;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion, txtRefrigerios;

    @FXML
    private TextField txtTransporte, txtTelefonia, txtOtros;

    @FXML
    private TextField txtTotal, txtMayor;

    @FXML
    private void calcular() {

        double alimentacion =
                Double.parseDouble(txtAlimentacion.getText());

        double refrigerios =
                Double.parseDouble(txtRefrigerios.getText());

        double transporte =
                Double.parseDouble(txtTransporte.getText());

        double telefonia =
                Double.parseDouble(txtTelefonia.getText());

        double otros =
                Double.parseDouble(txtOtros.getText());

        double total = alimentacion + refrigerios
                + transporte + telefonia + otros;

        DecimalFormat formato = new DecimalFormat("0.##");

        txtTotal.setText(formato.format(total));

        double mayor = alimentacion;
        String categoria = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            categoria = "Refrigerios";
        }

        if (transporte > mayor) {
            mayor = transporte;
            categoria = "Transporte";
        }

        if (telefonia > mayor) {
            mayor = telefonia;
            categoria = "Telefonía";
        }

        if (otros > mayor) {
            mayor = otros;
            categoria = "Otros";
        }

        txtMayor.setText(categoria);
    }

    @FXML
    private void limpiar() {

        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();

        txtTotal.clear();
        txtMayor.clear();

        txtAlimentacion.requestFocus();
    }
}