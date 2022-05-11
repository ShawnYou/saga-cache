package com.shawnyou.saga.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

/**
 * 本地缓存管理器
 * 
 * @version 1.0 created by youshuanglin on 2022/4/4 5:48 下午
 */

public class LocalCacheManagerAdapter extends AbstractCacheManager {
    private Map<String, LocalCacheManager> localCacheManagerMap = new HashMap<>();

    @Override
    protected Collection<? extends Cache> loadCaches() {
        LocalCacheManager localCacheManager = localCacheManagerMap.get("0");
        return null;
    }
}
