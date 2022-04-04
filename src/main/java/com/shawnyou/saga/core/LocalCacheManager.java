package com.shawnyou.saga.core;

import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.AbstractCacheManager;

/**
 * 本地缓存管理器
 * 
 * @version 1.0 created by youshuanglin on 2022/4/4 5:48 下午
 */

public class LocalCacheManager extends AbstractCacheManager {
    private CacheManager cacheManager;

    public LocalCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    protected Collection<? extends Cache> loadCaches() {

        return null;
    }
}
