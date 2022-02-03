package com.koder.demo2.service;

import java.util.List;
import com.koder.demo2.model.Employee;
import com.koder.demo2.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        java.util.Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent()){
            employee = optional.get();
        }else{
            throw new RuntimeException("Eployee not found with id :"+ id);
        }
        return employee;
    }
    
    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
        
    }
}
