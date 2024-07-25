package com.practice.graphql.controller;

import com.practice.graphql.service.EmpInfoService;
import com.practice.graphql.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.graphql.test.tester.GraphQlTester;

/**
 * @author tarek
 * {@code @date} 25-07-2024
 **/
@GraphQlTest(EmployeeController.class)
public class EmployeeControllerTests {

    @Autowired
    private GraphQlTester graphQlTester;

    @MockBean
    EmpInfoService empInfoService;

    @MockBean
    EmpService empService;

    @Test
    public void shouldGetFirstEmployee() {
        this.graphQlTester
                .documentName("employeeDetails")
                .variable("id", "7d485fca-1955-4ba8-b9e4-bb79e9156c76")
                .execute()
                .path("empInfoById")
                .matchesJson("""
                        {
                              "id": "de3f5690-ec4d-4c80-98ae-e5d810935ecd",
                              "scale": "10",
                              "salary": "5659.82",
                              "employee": {
                                "id": "7d485fca-1955-4ba8-b9e4-bb79e9156c76",
                                "name": "Mallu Poko",
                                "email": "mp@email.com"
                              }
                            }
                        """
                );
    }
}
