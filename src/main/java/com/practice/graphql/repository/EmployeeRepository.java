package com.practice.graphql.repository;

import com.practice.graphql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tarek
 * {@code @date} 24-07-2024
 **/
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
