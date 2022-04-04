package com.shawnyou.saga.core;

import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

/**
 * 多级缓存管理器
 * 
 * @version 1.0 created by youshuanglin on 2022/4/4 6:14 下午
 */
public class MultiCacheManager extends AbstractCacheManager {
    @Override
    protected Collection<? extends Cache> loadCaches() {
        return null;
    }
}
