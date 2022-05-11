package com.shawnyou.saga.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

/**
 * @version 1.0 created by youshuanglin on 2022/4/4 6:42 下午
 */
@Component
@ConditionalOnBean(RedisOperations.class)
public class CacheManagerConfiguration {

    @Bean
    @ConditionalOnMissingBean(RedisSerializer.class)
    public RedisSerializer redisSerializer() {
        return new GenericJackson2JsonRedisSerializer();
    }

}
