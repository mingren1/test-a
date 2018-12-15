package com.test.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@EnableAutoConfiguration
@SpringBootApplication
public class TestActivemqApplication {

	protected static Logger logger= LoggerFactory.getLogger(TestActivemqApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestActivemqApplication.class, args);
		logger.info("SpringBoot Start Success");
	}

}

