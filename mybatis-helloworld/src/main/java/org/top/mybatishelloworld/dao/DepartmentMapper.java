package org.top.mybatishelloworld.dao;

import org.apache.ibatis.annotations.Mapper;
import org.top.mybatishelloworld.model.Department;
import org.top.mybatishelloworld.model.DepartmentPlus;

@Mapper
public interface DepartmentMapper {

    Department getDeptById(Integer id);

    DepartmentPlus getDeptByIdPlus(Integer id);

    //分步查询
    DepartmentPlus getDeptByIdStep(Integer id);
}
