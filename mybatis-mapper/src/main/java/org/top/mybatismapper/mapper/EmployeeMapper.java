package org.top.mybatismapper.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.top.mybatismapper.model.Employee;

/**
 * 继承通用mapper后，基本的curd可以直接使用
 */
@Mapper
public interface EmployeeMapper extends tk.mybatis.mapper.common.Mapper<Employee> {


    //查询员工总数
    Integer count();

}
