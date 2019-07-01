package com.shawny.sagacache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfiguration {
    @Autowired
    SagaCacheProperties sagaCacheProperties;


}
