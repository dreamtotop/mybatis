package org.top.mybatishelloworld.dao;

import org.apache.ibatis.annotations.Mapper;
import org.top.mybatishelloworld.model.Employee;
import org.top.mybatishelloworld.model.EmployeePlus;

import java.util.List;

@Mapper
public interface EmployeePlusMapper {


    Employee getEmpById(Integer id);

    EmployeePlus getEmpAndDeptById(Integer id);

    EmployeePlus getEmtStepById(Integer id);

    List<Employee> getEmpsByDeptId(Integer deptId);

}
