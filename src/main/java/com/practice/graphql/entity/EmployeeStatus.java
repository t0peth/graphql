package com.practice.graphql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author tarek
 * {@code @date} 15-07-2024
 **/
@Entity

public class EmployeeStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String employee_id;
    private String status;
    private String scale;
    private String salary;

    public EmployeeStatus(String employee_id, String status, String scale, String salary) {
        this.employee_id = employee_id;
        this.status = status;
        this.scale = scale;
        this.salary = salary;
    }

    public EmployeeStatus() {

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getScale() {
        return scale;
    }
    public void setScale(String scale) {
        this.scale = scale;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
