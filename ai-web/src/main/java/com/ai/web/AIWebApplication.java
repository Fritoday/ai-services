package com.ai.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ai.web", "com.ai.biz", "com.ai.dal"})
public class AIWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AIWebApplication.class, args);
    }
}