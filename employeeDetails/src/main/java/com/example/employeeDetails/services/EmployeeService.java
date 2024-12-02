package com.example.employeeDetails.services;

import com.example.employeeDetails.entities.Employees;
import com.example.employeeDetails.repo.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeesRepo employeesRepo;


    public Employees addEmployees(Employees employees)
    {
        return employeesRepo.save(employees);
    }
}
