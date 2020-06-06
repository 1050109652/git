package com.wood.wood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wood.wood.mapper")
public class WoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoodApplication.class, args);
    }

}
