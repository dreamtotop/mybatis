package org.top.mybatishelloworld.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.top.mybatishelloworld.dao.EmployeeMapper;
import org.top.mybatishelloworld.model.Employee;
import org.top.mybatishelloworld.service.EmployeeService;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    //@Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee queryEmpById(Integer id) {
        if(id == null){
            return null;
        }
        return employeeMapper.getEmpById(id);
    }

    @Transactional
    @Override
    public void saveEmployee(Employee employee) {
        if(ObjectUtils.isEmpty(employee)){
            //逻辑处理
            return;
        }
        // 模拟发生异常数据回滚
        //int i =10 / 0;
        employeeMapper.addEmployee(employee);
    }

    @Transactional
    @Override
    public void updateEmployee(Employee employee) {
        Employee emp = employeeMapper.getEmpById(employee.getId());
        if(ObjectUtils.isEmpty(emp)){
            return;
        }
        BeanUtils.copyProperties(employee,emp);
        employeeMapper.updateEmployee(emp);
    }


    @Transactional
    @Override
    public void deleteById(Integer id) {
        if(id == null){
            return;
        }
        employeeMapper.deleteById(id);
    }

    @Override
    public Employee queryEmpByIdAndName(Integer id, String name) {
        if(id == null || name ==null){
            return null;
        }
        return employeeMapper.getEmpByIdAndName(id,name);
    }
}
