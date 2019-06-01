package com.shawny.core;

import com.shawny.config.ConfigBase;
import com.shawny.config.ExternalConfig;
import com.shawny.config.RedisConfig;
import com.shawny.config.SagaCacheConfig;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class RedisCacheBuilder extends AbstractBuilder{
    private RedisConfig redisConfig;

    public RedisCacheBuilder(SagaCacheConfig sagaCacheConfig){
        super(sagaCacheConfig);
        this.redisConfig = getRedisConfig();
        this.setCacheFunction(config-> new RedisCache((RedisConfig)config));
    }

    private RedisConfig getRedisConfig(){
        RedisConfig redisConfig = new RedisConfig();
        redisConfig.setJedisPool(getJedisPool());
        return redisConfig;
    }

    @Override
    public ConfigBase getConfig() {
        return redisConfig;
    }

    private JedisPool getJedisPool(){
        ExternalConfig external = sagaCacheConfig.getExternalConfig();

        JedisPool jedisPool = null;
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxIdle(external.getMaxIdle());
            config.setMaxWaitMillis(external.getMaxWaitMillis());
            config.setMaxTotal(external.getMaxTotal());

            //
            jedisPool = new JedisPool(config,external.getHost(),external.getPort());
        }catch (Exception e){
            e.printStackTrace();
        }

        return jedisPool;
    }
}
