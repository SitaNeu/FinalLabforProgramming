package com.example.hrmanagementsita;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.*;

public class HelloController {
    public Label Message;
    public TextField mail;
    public PasswordField Pass;
    public Button Logg;


    @FXML

    public void Login(ActionEvent actionEvent) {


        String a= mail.getText();
        String b= Pass.getText();


        String jdbcUrl = "jdbc:mysql://localhost:3306/dash_lab3";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "SELECT * FROM admin WHERE Email='" +a+"' AND Password='" +b+ "' ";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Populate the table with data from the database
            if (resultSet.next()) {


                try {

                    Parent secondScene = FXMLLoader.load(getClass().getResource("logview.fxml"));

                    Stage secondStage = new Stage();
                    secondStage.setTitle("Log Scene");
                    secondStage.setScene(new Scene(secondScene));

                    Stage firstSceneStage = (Stage) Logg.getScene().getWindow();
                    firstSceneStage.close();


                    secondStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }else {

                Message.setText("Invalid Username or Password.");


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    }
