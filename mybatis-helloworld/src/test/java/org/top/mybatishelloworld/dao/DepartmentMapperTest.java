package org.top.mybatishelloworld.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatishelloworld.model.DepartmentPlus;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void getDeptByIdPlus() {
        DepartmentPlus departmentPlus = departmentMapper.getDeptByIdPlus(1);
        System.out.println(departmentPlus);
    }

    @Test
    void getDeptByIdStep(){
        DepartmentPlus departmentPlus = departmentMapper.getDeptByIdStep(1);
        System.out.println(departmentPlus.getDeptName());
        //验证延迟加载
        System.out.println(departmentPlus.getEmps());
    }
}