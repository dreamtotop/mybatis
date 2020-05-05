package org.top.mybatispagehelper.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.top.mybatispagehelper.mapper.EmployeeMapper;
import org.top.mybatispagehelper.model.Employee;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps(Integer pageIndex, Integer pageSize){
        //PageHelper.startPage(pageIndex,pageSize);
        PageHelper.startPage(pageIndex,pageSize,"age");
        return employeeMapper.getEmpsByPage();
    }
}
