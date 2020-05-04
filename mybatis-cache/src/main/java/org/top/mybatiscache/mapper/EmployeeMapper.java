package org.top.mybatiscache.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.top.mybatiscache.model.Employee;

@Mapper
public interface EmployeeMapper {

    Employee getEmpById(Integer id);
}
