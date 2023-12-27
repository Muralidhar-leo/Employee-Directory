package com.employee.Employee.employeRequest;

public class EmployeRequest {

    public EmployeRequest() {
    }

    private  String Name;
    private String Description;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public EmployeRequest(String name, String description) {
        Name=name;
        Description = description;
    }
}
