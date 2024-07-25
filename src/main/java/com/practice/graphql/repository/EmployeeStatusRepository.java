package com.practice.graphql.repository;

import com.practice.graphql.entity.EmployeeStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author tarek
 * {@code @date} 24-07-2024
 **/
public interface EmployeeStatusRepository extends JpaRepository<EmployeeStatus, String> {

    @Query(value = "select empst from EmployeeStatus empst where empst.employee_id = ?1")
    List<EmployeeStatus> findAllEmployeeStatus(String employee_id);
}
