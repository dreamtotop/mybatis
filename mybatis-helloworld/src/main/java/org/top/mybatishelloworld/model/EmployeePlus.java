package org.top.mybatishelloworld.model;

import lombok.Data;

@Data
public class EmployeePlus {

    private Integer id;

    private String empName;

    private Integer age;

    private String address;

    private Department dept;
}
