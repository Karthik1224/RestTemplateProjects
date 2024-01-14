package com.example.Employee.Controllers;


import com.example.Employee.Modals.Employe;
import com.example.Employee.Services.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class employeeController{


    @Autowired
    private employeeService employee_service;
    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employe obj)
    {
        employee_service.addEmployee(obj);
    }


    @GetMapping("/getAllEmployees")
    public List<Employe> getAllEmployees()
    {
        List<Employe>list = employee_service.getAllEmployees();
        return list;
    }
}
