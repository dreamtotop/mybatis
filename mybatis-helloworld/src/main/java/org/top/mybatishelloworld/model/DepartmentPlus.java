package org.top.mybatishelloworld.model;

import lombok.Data;

import java.util.List;

@Data
public class DepartmentPlus {

    private Integer id;

    private String deptName;

    private List<Employee> emps;
}
