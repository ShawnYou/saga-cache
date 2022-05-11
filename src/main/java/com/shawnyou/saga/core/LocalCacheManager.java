package com.shawnyou.saga.core;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

/**
 * @version 1.0 created by youshuanglin on 2022/4/5 12:10 下午
 */
public class LocalCacheManager extends AbstractCacheManager {
    private CaffeineCacheManagerAdapter caffeineCacheManagerAdapter;

    public LocalCacheManager(CaffeineCacheManagerAdapter caffeineCacheManagerAdapter) {
        this.caffeineCacheManagerAdapter = caffeineCacheManagerAdapter;
    }

    @Override
    protected Collection<? extends Cache> loadCaches() {
        return Arrays.asList(caffeineCacheManagerAdapter.createCaffeineCache(null));
    }
}
