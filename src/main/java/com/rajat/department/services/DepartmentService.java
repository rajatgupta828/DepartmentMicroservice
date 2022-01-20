package com.rajat.department.services;


import com.rajat.department.entities.Department;
import com.rajat.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDeparment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return  departmentRepository.save(department);

    }

    public Department getDepartmentbyId(int departmentID) {
        log.info("Inside getDepartmentbyId method of DepartmentService");
        return  departmentRepository.findByDepartmentID(departmentID);
    }
}
