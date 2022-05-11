package com.shawnyou.saga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SagaCacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SagaCacheApplication.class, args);
    }

}
