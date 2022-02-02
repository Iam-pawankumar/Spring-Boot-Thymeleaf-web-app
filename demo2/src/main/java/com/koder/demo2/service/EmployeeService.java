package com.koder.demo2.service;

import java.util.List;

import com.koder.demo2.model.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
