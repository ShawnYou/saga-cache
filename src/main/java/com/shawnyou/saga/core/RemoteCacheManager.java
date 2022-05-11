package com.shawnyou.saga.core;

import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

/**
 * 远程缓存管理器
 * 
 * @version 1.0 created by youshuanglin on 2022/4/4 5:47 下午
 */

public class RemoteCacheManager extends AbstractCacheManager {

    private RedisCacheManagerAdapter redisCacheManagerAdapter;

    public RemoteCacheManager(RedisCacheManagerAdapter redisCacheManagerAdapter) {
        this.redisCacheManagerAdapter = redisCacheManagerAdapter;
    }

    @Override
    protected Collection<? extends Cache> loadCaches() {
        return redisCacheManagerAdapter.loadCaches();
    }
}
