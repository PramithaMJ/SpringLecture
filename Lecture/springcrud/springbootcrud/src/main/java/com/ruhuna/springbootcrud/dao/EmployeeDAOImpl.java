package com.ruhuna.springbootcrud.dao;

import com.ruhuna.springbootcrud.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

    private EntityManager entityManager;

    //Constructor based Dependency injection
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //JPQL
        TypedQuery<Employee> typedQuery = entityManager.createQuery("from Employee",Employee.class);
        List<Employee> resultSet = typedQuery.getResultList();

        return  resultSet;

    }

    @Override
    public Employee findbyID(int id) {

        //select * from employee where id = id
        Employee employee = entityManager.find(Employee.class,id);
        return employee;
    }

    @Override
    @Transactional
    public Employee save(Employee employee){
        Employee savedEmployee = entityManager.merge(employee);

        return savedEmployee;
    }

    @Override
    @Transactional
    public void deleteByID(int id) {

        Employee employee = entityManager.find(Employee.class,id);
        entityManager.remove(employee);
    }
}
