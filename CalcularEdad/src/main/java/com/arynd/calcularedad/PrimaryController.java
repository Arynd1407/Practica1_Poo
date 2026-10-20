package com.arynd.calcularedad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {

        String fecha = txtFecha.getText();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/uuuu")
                                 .withResolverStyle(
                                     java.time.format.ResolverStyle.STRICT
                                 );

        LocalDate nacimiento =
                LocalDate.parse(fecha, formato);

        LocalDate actual = LocalDate.now();

        Period edad = Period.between(nacimiento, actual);

        int anios = edad.getYears();
        int meses = edad.getMonths();

        lblResultado.setText(
                "Tiene " + anios + " años con "
                + meses + " meses"
        );
    }

    @FXML
    private void limpiar() {

        txtFecha.clear();

        lblResultado.setText("");

        txtFecha.requestFocus();
    }
}