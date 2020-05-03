package org.top.mybatishelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ImportResource(locations = "classpath:mybatis-config.xml")
@SpringBootApplication
public class MybatisHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisHelloworldApplication.class, args);
    }

}
