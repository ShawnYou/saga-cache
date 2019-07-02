package com.shawny.sagacache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfiguration {
    @Autowired
    SagaCacheProperties sagaCacheProperties;


    @Bean
    public JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(10);
        poolConfig.setMinIdle(1);
        return poolConfig;
    }


    @Bean
    public RedisTemplate redisTemplate(){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(getConnectionFactory());
        //redisTemplate.setKeySerializer();
        return redisTemplate;
    }

    @Bean
    public JedisConnectionFactory getConnectionFactory(){
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
        connectionFactory.setPoolConfig(getJedisPoolConfig());
        connectionFactory.setPort(sagaCacheProperties.getExternal().getPort());
        connectionFactory.setHostName(sagaCacheProperties.getExternal().getHost());
        //connectionFactory.setPassword("");
        connectionFactory.setTimeout(10000);
        return connectionFactory;
    }


}
