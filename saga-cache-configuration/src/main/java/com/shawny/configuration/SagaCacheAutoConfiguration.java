package com.shawny.configuration;

import com.shawny.annotation.EnableSagaCache;
import com.shawny.aop.CacheAdvisor;
import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by shawn_lin on 2019/5/9.
 */
@Configuration
public class SagaCacheAutoConfiguration implements ImportAware{
    protected AnnotationAttributes enableSagaCache;

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        this.enableSagaCache = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(EnableSagaCache.class.getName(),false));
        if(this.enableSagaCache == null){
            throw new IllegalArgumentException("@EnableSagaCache is not present on importing class "+annotationMetadata.getClassName());
        }
    }

    @Bean
    public CacheAdvisor sagaCacheAdvisor(){
        CacheInterceptor interceptor = new CacheInterceptor();

        CacheAdvisor advisor = new CacheAdvisor();
        advisor.setAdvice(interceptor);

        return advisor;
    }
}
