package org.top.mybatishelloworld.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
//@Alias("emp")
public class Employee {

    private Integer id;

    private String empName;

    private Integer age;

    private String address;

}
