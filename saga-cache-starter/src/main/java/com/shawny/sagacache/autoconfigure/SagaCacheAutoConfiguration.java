package com.shawny.sagacache.autoconfigure;


import com.shawny.sagacache.annotation.EnableSagaCache;
import com.shawny.sagacache.config.RedisConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by shawn_lin on 2019/5/9.
 */
@Configuration
@Import(RedisConfiguration.class)
public class SagaCacheAutoConfiguration implements ImportAware,ApplicationContextAware {
    @Autowired
    private RedisTemplate redisTemplate;

    private ApplicationContext applicationContext;

    protected AnnotationAttributes enableSagaCache;

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        this.enableSagaCache = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(EnableSagaCache.class.getName(),false));
        if(this.enableSagaCache == null){
            throw new IllegalArgumentException("@EnableSagaCache is not present on importing class "+annotationMetadata.getClassName());
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
