package com.example.employeeDetails.repo;

import com.example.employeeDetails.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeesRepo extends JpaRepository<Employees,Integer> {

    Optional<Employees> findByEmail(String email);
}
