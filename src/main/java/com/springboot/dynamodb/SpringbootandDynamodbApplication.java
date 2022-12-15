package com.springboot.dynamodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//lombok annotation for logger
@Slf4j
//spring annotation
@SpringBootApplication
public class SpringbootandDynamodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootandDynamodbApplication.class, args);
        log.info("Springboot and dynamodb application started successfully.");
    }
}
