package com.shawnyou.saga.core;

import java.util.Collection;

import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;

/**
 * @version 1.0 created by youshuanglin on 2022/4/4 6:22 下午
 */

public class RedisCacheManagerAdapter extends RedisCacheManager {

    public RedisCacheManagerAdapter(RedisCacheWriter cacheWriter,
                                    RedisCacheConfiguration defaultCacheConfiguration,
                                    boolean allowInFlightCacheCreation) {
        super(cacheWriter, defaultCacheConfiguration, allowInFlightCacheCreation);
    }

    @Override
    public Collection<RedisCache> loadCaches() {
        return super.loadCaches();
    }
}
