package com.test.quartz;

import com.test.quartz.produce.MsgProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestQuartzApplication.class, args);

    }

}

