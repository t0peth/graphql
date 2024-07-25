package com.practice.graphql.controller;

import com.practice.graphql.records.Emp;
import com.practice.graphql.records.EmpInfo;
import com.practice.graphql.service.EmpInfoService;
import com.practice.graphql.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tarek
 * {@code @date} 24-07-2024
 **/
@RestController
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @Autowired
    private EmpInfoService empInfoService;

    @QueryMapping
    public EmpInfo empInfoById(@Argument String id) {
        return empInfoService.getById(id);
    }

    @SchemaMapping
    public Emp employee(EmpInfo empInfo) {
        return empService.getById(empInfo.emp_id());
    }
}
