package com.javastar.processingData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProcessingDataApplication {

	public static void main(String[] args) throws Exception {
		System.exit(SpringApplication.exit(
		SpringApplication.run(ProcessingDataApplication.class, args)));
	}

}
