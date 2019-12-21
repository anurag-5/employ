package com.buji.anurag.emp;

public class Empmodel {
public String empname,designation,salary,place;

    public Empmodel() {
    }

    public Empmodel(String empname, String designation, String salary, String place) {
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
        this.place = place;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
