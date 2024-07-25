package com.practice.graphql.service;

import com.practice.graphql.entity.Employee;
import com.practice.graphql.records.Emp;
import com.practice.graphql.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tarek
 * {@code @date} 25-07-2024
 **/
@Service
@Transactional
public class EmpService {

    @Autowired
    private EmployeeRepository repository;

    public Emp getById(String id) {
        List<Employee> employees = repository.findById(id).stream().toList();

        Employee employee = employees.stream()
                .filter(emp -> emp.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
        return employee != null ? new Emp(employee.getId(), employee.getFirstName() + " " + employee.getLastName(), employee.getEmail()) : null;
    }
}
