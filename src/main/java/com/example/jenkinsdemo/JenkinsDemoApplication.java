package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

/**
 * @author zhaiyujia
 * @date 2023/09/27
 */
@SpringBootApplication(scanBasePackages = {"com.example.jenkinsdemo"}, exclude = R2dbcAutoConfiguration.class)
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
