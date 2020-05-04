package org.top.mybatiscache.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatiscache.model.Employee;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void testCache(){
        Employee emp = employeeMapper.getEmpById(1);
        System.out.println(emp);
        Employee cache = employeeMapper.getEmpById(1);
        System.out.println(cache);
    }


}