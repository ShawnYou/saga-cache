package com.shawnyou.saga.core;

import java.util.Collection;

import org.springframework.cache.Cache;

/**
 * @version 1.0 created by youshuanglin on 2022/4/5 12:10 下午
 */
public interface LocalCacheManager {
    /**
     * 加载缓存对象
     * 
     * @return
     */
    public Collection<Cache> loadCaches();
}
