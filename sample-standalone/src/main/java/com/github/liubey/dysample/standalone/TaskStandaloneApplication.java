package com.github.liubey.dysample.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"com.github.liubey.dysample.web.**",
        "com.github.liubey.dysample.manager.**",
        "com.github.liubey.dysample.scheduler.**"})
@SpringBootApplication
public class TaskStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskStandaloneApplication.class, args);
    }
}
