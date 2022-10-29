package com.ehsan.pollrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PollRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PollRestApplication.class, args);
    }

}
