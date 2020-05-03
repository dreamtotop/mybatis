package org.top.mybatishelloworld.dao;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatishelloworld.model.Employee;
import org.top.mybatishelloworld.model.EmployeePlus;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeePlusMapperTest {
    @Autowired
    private EmployeePlusMapper employeePlusMapper;

    @Test
    void getEmpById(){
        Employee emp = employeePlusMapper.getEmpById(1);
        System.out.println(emp);
    }

    @Test
    void getEmpAndDeptById(){
        EmployeePlus emp = employeePlusMapper.getEmpAndDeptById(1);
        System.out.println(emp);
        System.out.println(emp.getDept().getDeptName());
    }

    @Test
    void getEmpStepById(){
        EmployeePlus emp = employeePlusMapper.getEmtStepById(1);
        System.out.println(emp.getEmpName());
        //验证懒加载
        System.out.println(emp.getDept());

    }

}