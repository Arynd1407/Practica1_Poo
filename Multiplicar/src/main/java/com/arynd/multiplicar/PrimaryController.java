package com.arynd.multiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtResultado;

    @FXML
    private void calcular() {

        int numero = Integer.parseInt(txtNumero.getText());

        String tabla = "";

        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            tabla = tabla + numero + " x " + i
                    + " = " + resultado + "\n";
        }

        txtResultado.setText(tabla);
    }

    @FXML
    private void limpiar() {

        txtNumero.clear();
        txtResultado.clear();

        txtNumero.requestFocus();
    }
}