package com.example.Employee.model;


import jakarta.persistence.*;

@Entity
@Table (name = "EmployeeDetails")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "employee_id")
    private long id;

    @Column (name = "first_name", nullable = false)
    private String firstName;

    @Column (name = "last_name", nullable = false)
    private String lastName;

    @Column (nullable = false)
    private String email;

    private long password;

    @OneToOne(mappedBy = "employee")
    private UserLogin userLogin;

}
