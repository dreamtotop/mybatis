package org.top.mybatiscache.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatiscache.model.Employee;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeePlusMapperTest {

    @Autowired
    private EmployeePlusMapper employeePlusMapper;

    @Test
    void testRedisCache(){
        Employee emp = employeePlusMapper.getEmpById(1);
        System.out.println(emp);
        Employee empCache =employeePlusMapper.getEmpById(1);
        System.out.println(empCache);
    }

}