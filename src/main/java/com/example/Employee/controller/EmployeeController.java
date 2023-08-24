package com.example.Employee.controller;


import com.example.Employee.model.Employee;
import com.example.Employee.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/api/employee")
public class EmployeeController {

@Autowired
    EmployeeServiceImpl employeeServiceImpl;



    public ResponseEntity<Employee> addEmployee (Employee employee){
        return new ResponseEntity<>(employeeServiceImpl.addEmployeeDetails(employee), HttpStatus.CREATED);
    }
}
