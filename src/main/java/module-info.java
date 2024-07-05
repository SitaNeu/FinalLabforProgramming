module com.example.hrmanagementsita {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hrmanagementsita to javafx.fxml;
    exports com.example.hrmanagementsita;
}