package com.ruhuna.springbootcrud.service;

import com.ruhuna.springbootcrud.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findbyID(int id);
    Employee save(Employee employee);
    void deleteByID(int id);
}
