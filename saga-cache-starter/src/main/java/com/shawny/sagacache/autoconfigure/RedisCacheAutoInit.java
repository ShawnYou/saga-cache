package com.shawny.sagacache.autoconfigure;

import com.shawny.sagacache.config.SagaCacheProperties;
import com.shawny.sagacache.core.CacheBuilder;
import com.shawny.sagacache.core.RedisCacheBuilder;

/**
 * Created by shawn_lin on 2019/7/3.
 */
public class RedisCacheAutoInit extends AbstractCacheConfigAutoInit{
    @Override
    protected CacheBuilder createCacheBuilder(SagaCacheProperties sagaCacheProperties) {
        RedisCacheBuilder cacheBuilder = new RedisCacheBuilder(sagaCacheProperties);
        return cacheBuilder;
    }
}
