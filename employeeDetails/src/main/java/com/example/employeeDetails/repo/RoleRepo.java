package com.example.employeeDetails.repo;

import com.example.employeeDetails.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {

}
