package org.top.mybatishelloworld.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatishelloworld.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    void getEmpByIdAndName() {
        Employee emp = employeeMapper.getEmpByIdAndName(1, "test01");
        System.out.println(emp);
    }

    @Test
    void queryEmpByIds(){
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Employee> emp = employeeMapper.getEmpByIds(list);
        System.out.println(emp.get(0));
    }

    @Test
    void getEmpsByNameLike(){
        String empName = "%test%";
        List<Employee> empsByNameLike = employeeMapper.getEmpsByNameLike(empName);
        System.out.println(empsByNameLike.size());
    }

    @Test
    void getEmpByIdAndRetuenMap(){
        Map<String, Object> map = employeeMapper.getEmpByIdAndRetuenMap(1);
        System.out.println(map);
    }

    @Test
    void getEmpsByNameLikeAndRetuenMap(){
        String empName = "%test%";
        Map<Integer, Employee> map = employeeMapper.getEmpsByNameLikeAndRetuenMap(empName);
        System.out.println(map);
    }
}