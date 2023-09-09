package com.ruhuna.springbootcrud.rest;
import com.ruhuna.springbootcrud.dao.IEmployeeDAO;
import com.ruhuna.springbootcrud.entities.Employee;
import com.ruhuna.springbootcrud.service.EmployeeServiceImpl;
import com.ruhuna.springbootcrud.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api")
@RestController
public class EmployeeRESTController {
    private IEmployeeService employeeService;


    @Autowired
    //Constructor Based DI
    public EmployeeRESTController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
    //localhost:8080/api/employees
    @GetMapping("/employees")
    List<Employee> findAllEmployees()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{requeatedId}")
    Employee findEmployeeById(@PathVariable int requestedId)
    {
        //if this id is not in the databse this employee object will be null
        Employee employee = employeeService.findbyID(requestedId);

        if(employee==null)
        {
            throw new RuntimeException("Requested Employee id not found - "+requestedId);
        }
        else{
            return employee;
        }

    }
    @PostMapping("/employees")
    Employee addEmployee(@RequestBody Employee theEmployee)
    {
        Employee Savedemployee = employeeService.save(theEmployee);
        return Savedemployee;
    }

    @PutMapping ("/employees")
    Employee updateEmployee(@RequestBody Employee theEmployee)
    {
        //id its there it is update the existing one
        //if its not there it will create a new record in the database
        Employee employee = employeeService.save(theEmployee);
        return employee;
    }

    @DeleteMapping("/employees/{requestedId}")
    public void deletedEmployeeById(@PathVariable int id){
        
    }


}
