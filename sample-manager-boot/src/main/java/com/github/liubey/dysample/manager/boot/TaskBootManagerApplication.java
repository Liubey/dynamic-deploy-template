package com.github.liubey.dysample.manager.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value={"com.github.liubey.dysample.manager.**"})
@SpringBootApplication
public class TaskBootManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskBootManagerApplication.class, args);
	}
}
