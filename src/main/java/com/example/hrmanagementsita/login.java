package com.example.hrmanagementsita;

public class login {

    private int AdminID;
    private String AdminName;
    private int Salary;

    private String Email;

    private String Password;


    public login(int AdminID, String AdminName, String Email, String Password , int Salary) {
        this.AdminID = AdminID;
        this.AdminName = AdminName;
        this.Salary = Salary;
        this.Email = Email;
        this.Password = Password;

    }

    public int getId() {
        return AdminID;
    }

    public void setId(int AdminID) {
        this.AdminID = AdminID;
    }

    public String getName() {
        return AdminName;
    }

    public void setName(String AdminName) {
        this.AdminName = AdminName;
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








