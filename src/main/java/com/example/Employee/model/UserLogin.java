package com.example.Employee.model;


import jakarta.persistence.*;

@Entity
@Table (name = "UserLogin")
public class UserLogin {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "user_id")
    private long id;

    @Column (name = "first_name")
    private String firstName;

    private String email;

    private String password;

    private boolean enabled;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;



}
