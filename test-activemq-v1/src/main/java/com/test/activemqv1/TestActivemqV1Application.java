package com.test.activemqv1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestActivemqV1Application {

	private static final Logger logger = LoggerFactory.getLogger(TestActivemqV1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(TestActivemqV1Application.class, args);
		logger.info("success start!!!");
	}

}

