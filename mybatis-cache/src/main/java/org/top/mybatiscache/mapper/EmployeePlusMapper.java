package org.top.mybatiscache.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.top.mybatiscache.model.Employee;

//整合redis作为缓存

@Mapper
public interface EmployeePlusMapper {

    Employee getEmpById(Integer id);
}
