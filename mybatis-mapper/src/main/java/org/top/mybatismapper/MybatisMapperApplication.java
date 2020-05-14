package org.top.mybatismapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "org.top.mybatismapper.mapper")
public class MybatisMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMapperApplication.class, args);
    }

}
