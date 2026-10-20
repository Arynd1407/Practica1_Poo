package com.arynd.desglosedinero; 

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtDinero;

    @FXML
    private Label lbl500, lbl200, lbl100, lbl50, lbl20;
    
    @FXML
    private Label lbl10, lbl5, lbl2, lbl1;

    @FXML
    private void desglosar() {

        int dinero = Integer.parseInt(txtDinero.getText());

        int b500 = dinero / 500;
        dinero = dinero % 500;

        int b200 = dinero / 200;
        dinero = dinero % 200;

        int b100 = dinero / 100;
        dinero = dinero % 100;

        int b50 = dinero / 50;
        dinero = dinero % 50;

        int b20 = dinero / 20;
        dinero = dinero % 20;

        int m10 = dinero / 10;
        dinero = dinero % 10;

        int m5 = dinero / 5;
        dinero = dinero % 5;

        int m2 = dinero / 2;
        dinero = dinero % 2;

        int m1 = dinero;

        lbl500.setText("" + b500);
        lbl200.setText("" + b200);
        lbl100.setText("" + b100);
        lbl50.setText("" + b50);
        lbl20.setText("" + b20);

        lbl10.setText("" + m10);
        lbl5.setText("" + m5);
        lbl2.setText("" + m2);
        lbl1.setText("" + m1);
    }

    @FXML
    private void limpiar() {

        txtDinero.clear();

        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");

        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");

        txtDinero.requestFocus();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}