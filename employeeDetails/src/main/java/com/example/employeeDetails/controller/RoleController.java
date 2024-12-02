package com.example.employeeDetails.controller;

import com.example.employeeDetails.entities.Role;
import com.example.employeeDetails.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role/api")
public class RoleController {

    @Autowired
    private RoleService service;

    @PostMapping("/addRole")
    public ResponseEntity<Role> addRole(@RequestBody Role role)
    {
        return ResponseEntity.ok(service.addRole(role));
    }

}
