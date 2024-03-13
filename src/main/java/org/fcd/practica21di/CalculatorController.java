package org.fcd.practica21di;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    private double number1 = 0;
    private String operator = "";

    @FXML
    protected void pressNumber(javafx.event.ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    protected void pressOperator(javafx.event.ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getText();
        this.number1 = Double.parseDouble(display.getText());
        this.operator = value;
        display.setText("");
    }

    @FXML
    protected void calculate() {
        double number2 = Double.parseDouble(display.getText());
        switch (operator) {
            case "+":
                display.setText(String.valueOf(number1 + number2));
                break;
            case "-":
                display.setText(String.valueOf(number1 - number2));
                break;
            case "*":
                display.setText(String.valueOf(number1 * number2));
                break;
            case "/":
                if (number2 != 0) {
                    display.setText(String.valueOf(number1 / number2));
                } else {
                    display.setText("Error");
                }
                break;
        }
    }

    @FXML
    protected void clear() {
        display.setText("");
        number1 = 0;
        operator = "";
    }
}