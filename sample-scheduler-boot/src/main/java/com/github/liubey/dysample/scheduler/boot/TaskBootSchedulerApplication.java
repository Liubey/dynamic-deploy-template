package com.github.liubey.dysample.scheduler.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"com.github.liubey.dysample.scheduler.**"})
@SpringBootApplication
public class TaskBootSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskBootSchedulerApplication.class, args);
    }
}
