package com.example.hrmanagementsita;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class crudcontroller {


    public Button adminn;
    public Button employ;
    public Button out;
    public Button end;

    public void logAdmin(ActionEvent actionEvent) {

        try {

            Parent secondScene = FXMLLoader.load(getClass().getResource("Adminview.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("Admin Scene");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) adminn.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void logEmployee(ActionEvent actionEvent) {

        try {
        Parent secondScene = FXMLLoader.load(getClass().getResource("employeeview.fxml"));

        Stage secondStage = new Stage();
        secondStage.setTitle("Employee Scene");
        secondStage.setScene(new Scene(secondScene));

        Stage firstSceneStage = (Stage) employ.getScene().getWindow();
        firstSceneStage.close();

        secondStage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }


    }

    public void Logout(ActionEvent actionEvent) {

        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("logout Scene");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) out.getScene().getWindow();
            firstSceneStage.close();

            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Exitt(ActionEvent actionEvent) {

   System.exit(0);

    }
}
