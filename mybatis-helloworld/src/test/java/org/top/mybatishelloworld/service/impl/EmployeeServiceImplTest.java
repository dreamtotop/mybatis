package org.top.mybatishelloworld.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatishelloworld.model.Employee;
import org.top.mybatishelloworld.service.EmployeeService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void queryEmpById() {
        Employee employee = employeeService.queryEmpById(2);
        System.out.println(employee);
        //employeeService.queryEmpById(1);
    }

    @Test
    void addEmployee(){
        Employee employee = new Employee();
        employee.setEmpName("test04");
        employee.setAddress("hangzhou");
        employee.setAge(20);
        employeeService.saveEmployee(employee);
        //如果不在xml中配置主键自增的映射配置，主键不会自动封装
        System.out.println(employee.getId());
    }

    @Test
    void update(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("test01");
        employee.setAddress("hangzhou");
        employee.setAge(20);
        employeeService.updateEmployee(employee);
    }

    @Test
    void delete(){
        employeeService.deleteById(3);
    }

    @Test
    public void queryByIdAndName(){
        Employee employee = employeeService.queryEmpByIdAndName(1, "test01");
        System.out.println(employee);
    }
}