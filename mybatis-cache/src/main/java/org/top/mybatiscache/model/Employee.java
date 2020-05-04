package org.top.mybatiscache.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {

    private Integer id;

    private String empName;

    private Integer age;

    private String address;

}
