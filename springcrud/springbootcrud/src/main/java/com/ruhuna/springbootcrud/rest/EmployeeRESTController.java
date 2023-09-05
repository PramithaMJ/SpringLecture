package com.ruhuna.springbootcrud.rest;

import com.ruhuna.springbootcrud.dao.EmployeeDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class EmployeeRESTController {

    private EmployeeDAOImpl employeeDAO;

    @Autowired
    public EmployeeRESTController(EmployeeDAOImpl employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public String findAll() {
        System.out.printf("pramitha");
        return employeeDAO.findAll().toString();
    }

}
