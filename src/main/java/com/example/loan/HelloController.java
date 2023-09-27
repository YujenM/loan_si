package com.example.loan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button calculate;

    @FXML
    private TextField inputannualrate;

    @FXML
    private TextField inputloan;

    @FXML
    private TextField inputyears;

    @FXML
    private TextField payment;

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText11;

    @FXML
    private Label welcomeText111;
    @FXML
    private  TextField inputmonthlypayment;


    @FXML
    void onclik(ActionEvent event) {
        double total=monthlyInterestRate();
        double monthlyp=monthlypayment();
        payment.setText(String.valueOf("$"+total));
        inputmonthlypayment.setText(String.valueOf("$"+monthlyp));
    }
    private double monthlyInterestRate() {
        try {
            double principale=Double.parseDouble(inputloan.getText());
            double intrestrate=Double.parseDouble(inputannualrate.getText());
            double numberofyears=Double.parseDouble(inputyears.getText());
            double totalPaymentintresrt = (principale*intrestrate*numberofyears)/100;
            double totalPayment=principale+totalPaymentintresrt;
            return  totalPayment;
        } catch (NumberFormatException e) {
            inputannualrate.setText("Enter valid number");
            return 0.0;
        }
    }
    private double monthlypayment (){
        try{
            double total=monthlyInterestRate();
            double totalmonthlypayment=total/12;
            return totalmonthlypayment;
        }catch (NumberFormatException e){
            inputannualrate.setText("Enter valid number");
            return 0.0;
        }

    }


}
