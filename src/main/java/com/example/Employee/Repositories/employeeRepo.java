package com.example.Employee.Repositories;

import com.example.Employee.Modals.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface employeeRepo extends JpaRepository<Employe,Integer> {
}
