package com.arynd.divisores;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextField txtNumero, txtCantidad, txtImpares;
    
    @FXML
    private TextField txtPares, txtSuma, txtMayor, txtMenor;

    @FXML
    private TextArea txtDivisores;

    @FXML
    private void analizar() {

        int numero = Integer.parseInt(txtNumero.getText());
        int auxiliar = Math.abs(numero);

        int cantidad = 0;
        int impares = 0;
        int pares = 0;
        int suma = 0;
        int mayor = 0;
        int menor = 9;

        if (auxiliar == 0) {
            cantidad = 1;
            menor = 0;
        }

        while (auxiliar > 0) {

            int cifra = auxiliar % 10;

            cantidad++;

            suma = suma + cifra;

            if (cifra % 2 == 0) {
                pares = pares + cifra;
            } else {
                impares = impares + cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }

            auxiliar = auxiliar / 10;
        }

        txtCantidad.setText("" + cantidad);
        txtImpares.setText("" + impares);
        txtPares.setText("" + pares);
        txtSuma.setText("" + suma);
        txtMayor.setText("" + mayor);
        txtMenor.setText("" + menor);

        String divisores = "";

        for (int i = 1; i <= Math.abs((long) numero); i++) {

            if (numero % i == 0) {
                divisores = divisores + i + "\n";
            }
        }

        txtDivisores.setText(divisores);
    }

    @FXML
    private void limpiar() {

        txtNumero.clear();
        txtCantidad.clear();
        txtImpares.clear();
        txtPares.clear();
        txtSuma.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();

        txtNumero.requestFocus();
    }
}