package com.ss;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ss.api.mapper")
@EnableDubbo
public class ApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiServerApplication.class, args);
    }

}
