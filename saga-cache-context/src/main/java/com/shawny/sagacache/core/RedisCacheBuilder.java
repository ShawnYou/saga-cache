package com.shawny.sagacache.core;

import com.shawny.sagacache.config.ConfigBase;
import com.shawny.sagacache.config.RedisCacheConfig;
import com.shawny.sagacache.config.SagaCacheProperties;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class RedisCacheBuilder extends AbstractBuilder {
    private RedisCacheConfig redisCacheConfig;

    public RedisCacheBuilder(SagaCacheProperties sagaCacheProperties){
        super(sagaCacheProperties);
        this.redisCacheConfig = (RedisCacheConfig)this.getConfig();
        this.setCacheFunction(config-> new RedisCache((RedisCacheConfig)config));
    }

    private RedisCacheConfig getRedisCacheConfig(){
        RedisCacheConfig redisCacheConfig = new RedisCacheConfig();
        SagaCacheProperties.ExternalProperty externalProperty = sagaCacheProperties.getExternal();

        //redisCacheConfig.setJedisPool(getJedisPool());
        return redisCacheConfig;
    }

    @Override
    public ConfigBase getConfig() {
        return this.getRedisCacheConfig();
    }

    private JedisPoolConfig getJedisPoolConfig(){
        //TODO
        SagaCacheProperties.ExternalProperty externalProperty = sagaCacheProperties.getExternal();
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //jedisPoolConfig.setMinIdle(externalProperty.get);
        jedisPoolConfig.setMaxTotal(externalProperty.getMaxTotal());
        jedisPoolConfig.setMaxWaitMillis(10000);
        return jedisPoolConfig;
    }

    private JedisConnectionFactory jedisConnectionFactory(){
        //TODO redisTemplate 生成
        return null;
    }

}
