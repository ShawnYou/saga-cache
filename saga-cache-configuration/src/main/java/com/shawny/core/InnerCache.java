package com.shawny.core;


import com.shawny.config.InnerCacheConfig;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public class InnerCache extends AbstractCache {

    private Cache cache;

    public InnerCache(InnerCacheConfig innerCacheConfig) {
        super(innerCacheConfig);
        cache = innerCacheConfig.getCacheSelector();
    }

    @Override
    public CacheWrap GET(Object key) {
        return cache.getCache(key);
    }

    @Override
    public void PUT(Object key, Object value) {
        cache.putCache(key,value);
    }

    @Override
    public void DELETE(Object key) {
        cache.deleteCache(key);
    }
}
