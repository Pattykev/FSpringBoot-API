package com.apiRest.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiRest.api.model.Employee;
import com.apiRest.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final long id){
        return this.employeeRepository.findById(id);
    }
    public Iterable<Employee> getEmployees(){
        return this.employeeRepository.findAll();
    }
    public void deleteEmployee(final long id){
        this.employeeRepository.deleteById(id);
    }
    public Employee savEmployee(Employee employee){
        Employee savedEmployee= this.employeeRepository.save(employee);
        return savedEmployee;
    }
    
}
