package com.example.employeeDetails.controller;

import com.example.employeeDetails.entities.Employees;
import com.example.employeeDetails.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees/api")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployees")
    public ResponseEntity<Employees> addEmployees(@RequestBody Employees employees)
    {
        return ResponseEntity.ok(employeeService.addEmployees(employees));
    }
}
