package org.top.mybatismapper.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatismapper.model.Employee;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Test
    void getAll(){
        List<Employee> list = employeeMapper.selectAll();
        System.out.println(list.size());
        Employee employee = employeeMapper.selectByPrimaryKey(9);
        System.out.println(employee);

    }

    @Test
    void count() {
        Integer count = employeeMapper.count();
        System.out.println(count);
    }

    @Test
    void add(){
        Employee employee = new Employee();
        employee.setEmpName("test08");
        employee.setAddress("hangzhou");
        employee.setAge(20);
        employeeMapper.insert(employee);
    }
}