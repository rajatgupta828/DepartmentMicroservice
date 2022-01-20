package com.rajat.department.controller;

import com.rajat.department.entities.Department;
import com.rajat.department.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDeparment method of Department Controller");
        return departmentService.saveDeparment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentByID(@PathVariable("id") int departmentID){
        log.info("Inside getDepartmentByID method of Department Controller");

        return departmentService.getDepartmentbyId(departmentID);
    }



}
