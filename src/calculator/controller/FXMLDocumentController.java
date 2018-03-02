/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.controller;

import com.sun.media.jfxmedia.logging.Logger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author marco
 */
public class FXMLDocumentController implements Initializable {

//    @FXML
//    private Label label;
//    
    @FXML
    private TextField txtOutcome;
    @FXML
    private Button clearButton;
    @FXML
    private Button btnOne;
    @FXML
    private Label lblMessage;
    calculator.model.Calculator calc;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");

//        label.setText("Hello World!");
        Button allButs = (Button) event.getSource();
        if (("txtOutcome".equals(txtOutcome.getText())) || ("".equals(txtOutcome.getText()))) {
            txtOutcome.setText(allButs.getText());
        } else {
            txtOutcome.setText(txtOutcome.getText() + allButs.getText());
        }
        if ("=".equals(allButs.getText())) {
            if (txtOutcome.getText().equals("=")) {
                lblMessage.setText("Iets meer dan alleen een = is handig.");
                txtOutcome.setText("");
            } else {
                calc = new calculator.model.Calculator(txtOutcome.getText());
                txtOutcome.setText(String.valueOf(calc.getResultaat()));
            }

        }

    }

    @FXML
    public void handleClearButton(ActionEvent event) {
        Logger.logMsg(Logger.INFO, "Clicked on handleClearButton");
        txtOutcome.setText("");
    }

    @FXML
    public void removeLastEntry(ActionEvent event) {
        if (txtOutcome.getText().length() > 0) {
            txtOutcome.setText(txtOutcome.getText().substring(0, txtOutcome.getText().length() - 1));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
