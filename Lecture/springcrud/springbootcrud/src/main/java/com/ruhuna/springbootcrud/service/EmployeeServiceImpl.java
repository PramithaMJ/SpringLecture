package com.ruhuna.springbootcrud.service;
import com.ruhuna.springbootcrud.dao.IEmployeeDAO;
import com.ruhuna.springbootcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findbyID(int id) {
        return employeeDAO.findbyID(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public void deleteByID(int id) {
         employeeDAO.deleteByID(id);
    }
}
