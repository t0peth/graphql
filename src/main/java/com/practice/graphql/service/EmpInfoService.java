package com.practice.graphql.service;

import com.practice.graphql.entity.EmployeeStatus;
import com.practice.graphql.records.EmpInfo;
import com.practice.graphql.repository.EmployeeStatusRepository;
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
public class EmpInfoService {

    @Autowired
    private EmployeeStatusRepository repository;

    public EmpInfo getById(String emp_id) {
        List<EmployeeStatus> empInfos = repository.findAllEmployeeStatus(emp_id);

        EmployeeStatus employeeStatus = empInfos.stream()
                .filter(empInfo -> empInfo.getEmployee_id().equalsIgnoreCase(emp_id))
                .findFirst()
                .orElse(null);
        return employeeStatus != null ? new EmpInfo(employeeStatus.getId(), employeeStatus.getEmployee_id(), employeeStatus.getScale(), employeeStatus.getSalary()) : null;
    }
}
