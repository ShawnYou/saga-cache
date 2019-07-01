package com.shawny.sagacache.config;

import com.shawny.sagacache.aop.SagaCacheInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shawn_lin on 2019/6/27.
 */
@Configuration
public class SagaCachingConfiguration {
    @Bean
    public SagaCacheInterceptor cacheInterceptor(){
        SagaCacheInterceptor cacheInterceptor = new SagaCacheInterceptor();
        return cacheInterceptor;
    }

}
