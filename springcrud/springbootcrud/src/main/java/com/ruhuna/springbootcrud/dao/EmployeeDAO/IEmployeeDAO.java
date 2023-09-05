package com.ruhuna.springbootcrud.dao.EmployeeDAO;

import com.ruhuna.springbootcrud.entities.Employee;

import java.util.List;

//hiding the implementation details by interface
//interface is a is away to achieve abstraction
public interface IEmployeeDAO {

    List<Employee> findAll();
}
