package com.aurora;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aurora.mapper")
public class AuroraLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuroraLearnApplication.class, args);
    }

}
