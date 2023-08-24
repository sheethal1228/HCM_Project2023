package com.example.Employee.service;

import com.example.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    public void addEmployeeDetails(Employee employee);
    public List<Employee> getAllEmployeeDetails();
    public Employee getEmployeeById();
    public void deleteEmployee();
}
