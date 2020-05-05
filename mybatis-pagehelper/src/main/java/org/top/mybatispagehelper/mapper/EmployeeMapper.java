package org.top.mybatispagehelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.top.mybatispagehelper.model.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getEmpsByPage();
}
