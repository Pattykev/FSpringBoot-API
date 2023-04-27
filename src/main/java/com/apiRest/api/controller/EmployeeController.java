package com.apiRest.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.api.model.Employee;
import com.apiRest.api.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //ReadAll employee
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return this.employeeService.getEmployees();
    }

    //create an employee
    @PostMapping("/employee")
    public Employee savEmployee(@RequestBody Employee employee){
        return this.employeeService.savEmployee(employee);
    }

    //Read an employee
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") final Long id){
        Optional<Employee> employee=this.employeeService.getEmployee(id);
        if(employee.isPresent()){
            return employee.get();
        }
        else{
            return null;
        }
    }

    //delete an employee
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") final Long id){
        this.employeeService.deleteEmployee(id);
    }    

    //update an employee
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") final Long id, @RequestBody Employee employee){
        Optional<Employee> e=this.employeeService.getEmployee(id);
        if(e.isPresent()){
            Employee currentEmployee=e.get();
            String firstName=employee.getFirstName();
            String lastName=employee.getLastName();
            String mail=employee.getMail();
            String password=employee.getPassword();
            if(firstName != null){
                currentEmployee.setFirstName(firstName);
            }
            if(lastName != null){
                currentEmployee.setLastName(lastName);
            }
            if(mail != null){
                currentEmployee.setMail(mail);
            }
            if(password != null){
                currentEmployee.setPassword(password);
            }
            return currentEmployee;
        }
        else{
            return null;
        }
    }
}
