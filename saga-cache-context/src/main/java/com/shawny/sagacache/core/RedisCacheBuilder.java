package com.shawny.sagacache.core;

import com.shawny.sagacache.config.ConfigBase;
import com.shawny.sagacache.config.RedisCacheConfig;
import com.shawny.sagacache.config.SagaCacheProperties;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class RedisCacheBuilder extends AbstractBuilder {
    private RedisCacheConfig redisCacheConfig;

    public RedisCacheBuilder(SagaCacheProperties sagaCacheProperties){
        super(sagaCacheProperties);
        this.redisCacheConfig = getRedisCacheConfig();
        this.setCacheFunction(config-> new RedisCache((RedisCacheConfig)config));
    }

    private RedisCacheConfig getRedisCacheConfig(){
        RedisCacheConfig redisCacheConfig = new RedisCacheConfig();
        redisCacheConfig.setJedisPool(getJedisPool());
        return redisCacheConfig;
    }

    @Override
    public ConfigBase getConfig() {
        return redisCacheConfig;
    }

    private JedisPool getJedisPool(){
        SagaCacheProperties.ExternalProperty external = sagaCacheProperties.getExternal();

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
