package org.top.mybatispagehelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.top.mybatispagehelper.model.Employee;
import org.top.mybatispagehelper.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/pageHelper")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emps")
    public List<Employee> getEmps(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize){
        return employeeService.getEmps(pageIndex,pageSize);
    }
}
