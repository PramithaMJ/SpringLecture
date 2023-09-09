package com.ruhuna.springbootcrud.rest;
import com.ruhuna.springbootcrud.dao.IEmployeeDAO;
import com.ruhuna.springbootcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("api")
@RestController
public class EmployeeRESTController {
    private IEmployeeDAO employeeDAO;


    @Autowired
    //Constructor Based DI
    public EmployeeRESTController(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    //localhost:8080/api/employees
    @GetMapping("/employees")
    List<Employee> findAllEmployees()
    {
        return employeeDAO.findAll();
    }

    @GetMapping("/employees/{requeatedId}")
    Employee findEmployeeById(@PathVariable int requestedId)
    {
        return employeeDAO.findbyID(requestedId);
    }


}
