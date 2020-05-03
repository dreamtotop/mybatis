package org.top.mybatishelloworld.service;

import org.top.mybatishelloworld.model.Employee;

public interface EmployeeService {

    Employee queryEmpById(Integer id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteById(Integer id);

    Employee queryEmpByIdAndName(Integer id,String name);
}
