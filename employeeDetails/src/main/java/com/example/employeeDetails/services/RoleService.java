package com.example.employeeDetails.services;

import com.example.employeeDetails.entities.Role;
import com.example.employeeDetails.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo repo;

    public Role addRole(Role role)
    {
        return repo.save(role);
    }
}
