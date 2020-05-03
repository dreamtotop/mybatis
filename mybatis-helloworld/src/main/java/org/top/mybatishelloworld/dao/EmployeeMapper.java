package org.top.mybatishelloworld.dao;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.top.mybatishelloworld.model.Employee;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void addEmployee(Employee employee);

    void updateEmployee(@Param("emp")Employee employee);

    void deleteById(Integer id);

    //mybatis处理多参数
    Employee getEmpByIdAndName(Integer id,String empName);
    //Employee getEmpByIdAndName(@Param("id") Integer id,@Param("empName") String empName);

    //处理List，取第一个元素
    //List<Employee> getEmpByIds(List<Integer> ids);
    List<Employee> getEmpByIds(@Param("ids")List<Integer> ids);

    //返回List
    List<Employee> getEmpsByNameLike(String empName);

    //返回一条记录的Map, key为列名，value为对应的值
    Map<String,Object> getEmpByIdAndRetuenMap(Integer id);

    //返回多条记录的Map,key为主键值，value为主键对应的记录
    // 该注解的作用是指定返回的Map中使用哪个javabean的属性作为key
    @MapKey("id")
    Map<Integer,Employee> getEmpsByNameLikeAndRetuenMap(String empName);

}
