package com.example.hrmanagementsita;

public class Employee {

    private int EmployeeID;
    private String EmployeeName;
    private int Salary;

    private String Email;

    private String Password;


    public Employee(int EmployeeID, String EmployeeName,int Salary, String Email, String Password ) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.Salary = Salary;
        this.Email = Email;
        this.Password = Password;

    }

    public int getId() {
        return EmployeeID;
    }

    public void setId(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getName() {
        return EmployeeName;
    }

    public void setName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }


}
