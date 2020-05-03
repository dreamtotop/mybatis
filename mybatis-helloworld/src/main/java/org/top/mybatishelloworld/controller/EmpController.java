package org.top.mybatishelloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.top.mybatishelloworld.model.Employee;
import org.top.mybatishelloworld.service.EmployeeService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Resource
    //@Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Employee findEmpById(@RequestParam("id") Integer id){
        return  employeeService.queryEmpById(id);
    }
}
