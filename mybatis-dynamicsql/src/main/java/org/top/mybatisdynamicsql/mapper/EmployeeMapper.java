package org.top.mybatisdynamicsql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.top.mybatisdynamicsql.model.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    // if 标签的使用
    List<Employee> getEmpsByConditionIf(Employee employee);

    //where标签的使用
    List<Employee> getEmpsByConditionWhere(@Param("employee")Employee employee);

    //trim标签的使用
    List<Employee> getEmpsByConditionTrim(@Param("employee")Employee employee);

    //choose标签的使用
    List<Employee> getEmpsByConditionChoose(@Param("employee")Employee employee);

    //set标签的使用
    void updateEmpBySet(@Param("employee")Employee employee);

    //foreach标签的使用
    List<Employee> getEmpsByConditionForeach(@Param("ids") List<Integer> ids);

    //foreach批量保存
    void batchSaveByConditionForeach(@Param("emps")List<Employee> employee);

    //bind标签的使用
    List<Employee> getEmpsByConditionBind(String empName);
}
