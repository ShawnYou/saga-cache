package com.shawny.core;

import com.shawny.config.RedisConfig;

/**
 * Created by shawn_lin on 2019/5/30.
 */
public class RedisCache extends AbstractCache{

    public RedisCache(RedisConfig redisConfig) {
        super(redisConfig);
    }

    @Override
    public <T> T GET(Object key) {
        return null;
    }
}
