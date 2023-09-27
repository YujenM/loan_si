module com.example.loan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loan to javafx.fxml;
    exports com.example.loan;
}