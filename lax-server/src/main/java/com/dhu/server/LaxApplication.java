package com.dhu.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dhu.server.mapper")
public class LaxApplication {
    public static void main(String[] args) {
        SpringApplication.run(LaxApplication.class, args);
    }
}
