package com.example.Employee.service.impl;
import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployeeDetails(Employee employee){
        return employeeRepository.save(employee);
    }


}
