package com.example.employeeDetails.exception;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message)
    {
        super(message);
    }
}
