package com.shawny.configuration;

import com.shawny.aop.CacheAdvisor;
import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by shawn_lin on 2019/5/9.
 */
@Configuration
public class SagaCacheAutoConfiguration implements ImportAware{
    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {

    }

    @Bean
    public CacheAdvisor sagaCacheAdvisor(){
        CacheInterceptor interceptor = new CacheInterceptor();

        CacheAdvisor advisor = new CacheAdvisor();
        advisor.setAdvice(interceptor);

        return advisor;
    }
}
