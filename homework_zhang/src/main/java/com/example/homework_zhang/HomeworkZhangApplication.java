package com.example.homework_zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HomeworkZhangApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkZhangApplication.class, args);
    }

}
