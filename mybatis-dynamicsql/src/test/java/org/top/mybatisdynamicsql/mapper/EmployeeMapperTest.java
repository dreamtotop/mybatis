package org.top.mybatisdynamicsql.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.mybatisdynamicsql.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void getEmpsByCondition(){
        Employee employee = new Employee();
        employee.setId(1);
        //employee.setEmpName("hah");
        List<Employee> emps = employeeMapper.getEmpsByConditionIf(employee);
        System.out.println(emps);
    }
    @Test
    void testWhere(){
        Employee employee = new Employee();
        employee.setId(null);
        employee.setAddress("hangzhou");
        List<Employee> emps = employeeMapper.getEmpsByConditionWhere(employee);
        System.out.println(emps);
    }

    @Test
    void testTrim(){
        Employee employee = new Employee();
        employee.setId(1);
        List<Employee> emps = employeeMapper.getEmpsByConditionWhere(employee);
        System.out.println(emps);
    }

//    分支选择
    @Test
    void testChoose(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("%test%");
        List<Employee> emp = employeeMapper.getEmpsByConditionChoose(employee);
        System.out.println(emp);

    }

    @Test
    void testSet(){
        Employee employee = new Employee();
        employee.setId(2);
        employee.setEmpName("test002");
        employee.setAge(21);
        employee.setAddress("beijing");
        employeeMapper.updateEmpBySet(employee);
    }

    @Test
    void testForeach(){
        //List<Employee> emps = employeeMapper.getEmpsByConditionForeach(Arrays.asList(1, 2));
        List<Employee> emps = employeeMapper.getEmpsByConditionForeach(new Integer[]{1, 2});
        System.out.println(emps);
    }

    @Test
    void testBatchForeach(){
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setEmpName("test06");
        employee1.setAge(20);
        employee1.setAddress("shanghai");
        Employee employee2 = new Employee();
        employee2.setEmpName("test07");
        employee2.setAge(20);
        employee2.setAddress("shanghai");
        list.add(employee1);
        list.add(employee2);
        employeeMapper.batchSaveByConditionForeach(list);
    }

    @Test
    void testBind(){
        String empName = "test";
        List<Employee> emps = employeeMapper.getEmpsByConditionBind(empName);
        System.out.println(emps.size());
    }

}