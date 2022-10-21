package com.github.liubey.dysample.web.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"com.github.liubey.dysample.web.**"})
@SpringBootApplication
public class TaskWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskWebApplication.class, args);
    }
}
