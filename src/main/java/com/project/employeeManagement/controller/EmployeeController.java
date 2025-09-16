package com.project.employeeManagement.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    // Anyone logged in can view employees
    @GetMapping
    public List<String> getEmployees() {
        return List.of("John Doe", "Jane Smith", "Alice Johnson");
    }

    // Only ADMIN can create employees
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public String addEmployee(@RequestBody String employeeName) {
        return "Employee " + employeeName + " added successfully!";
    }
}
