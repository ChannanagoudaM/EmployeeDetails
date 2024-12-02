package com.example.employeeDetails.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String designation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eId")
    private Employees employees;
}
