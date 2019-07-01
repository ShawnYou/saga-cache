package com.shawny.sagacache;

import com.shawny.sagacache.annotation.EnableSagaCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSagaCache
@SpringBootApplication
public class SagaCacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SagaCacheApplication.class,args);
    }
}
