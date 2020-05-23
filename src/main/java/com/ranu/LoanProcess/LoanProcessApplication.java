package com.ranu.LoanProcess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class LoanProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanProcessApplication.class, args);
	}

}
