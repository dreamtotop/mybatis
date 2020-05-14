package org.top.mybatismapper.model;

import lombok.Data;

@Data
//@Alias("emp")
public class Employee {

    private Integer id;

    private String empName;

    private Integer age;

    private String address;

}
