package com.example.hrmanagementsita;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public abstract class EmployeeController implements Initializable {


    public TableView Tableview;
    public TableColumn EmployeeID;
    public TableColumn EmployeeName;
    public TableColumn Salary;
    public TableColumn Email;
    public TableColumn Password;

    public TextField id;
    public TextField name;
    public TextField salary;
    public TextField email;
    public TextField password;



    ObservableList<Employee> list = FXCollections.observableArrayList();

        @FXML
        protected void fetch () {
            fetchdata();
        }

        private void fetchdata () {
            list.clear();

            String jdbcUrl = "jdbc:mysql://localhost:3306/dash_lab3";
            String dbUser = "root";
            String dbPassword = "";
            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
                // Execute a SQL query to retrieve data from the database
                String query = "SELECT * FROM admin";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                // Populate the table with data from the database
                while (resultSet.next()) {
                    int EmployeeID = resultSet.getInt("EmployeeID");
                    String EmployeeName = resultSet.getString("EmployeeName");
                    int Salary = resultSet.getInt("Salary");
                    String Email = resultSet.getString("Email");
                    String Password = resultSet.getString("Password");
                    Tableview.getItems().add(new Employee(EmployeeID, EmployeeName,Salary, Email,Password));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        public void load (ActionEvent actionEvent){


        }

        public void insert (ActionEvent actionEvent){

         

        }

        public void delete (ActionEvent actionEvent){
        }

        public void update (ActionEvent actionEvent){
        }
    }



