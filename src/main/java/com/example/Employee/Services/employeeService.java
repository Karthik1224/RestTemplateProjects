package com.example.Employee.Services;


import com.example.Employee.Modals.Employe;
import com.example.Employee.Repositories.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeService {

    @Autowired
    private employeeRepo employee_repo;
    public void addEmployee(Employe obj)
    {
        employee_repo.save(obj);
    }

    public List<Employe> getAllEmployees()
    {
        List<Employe>list = employee_repo.findAll();
        return list;
    }
}
