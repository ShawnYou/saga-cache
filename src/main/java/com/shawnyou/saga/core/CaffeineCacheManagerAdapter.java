package com.shawnyou.saga.core;

import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.caffeine.CaffeineCacheManager;

/**
 * @version 1.0 created by youshuanglin on 2022/4/4 6:49 下午
 */
public class CaffeineCacheManagerAdapter extends CaffeineCacheManager implements LocalCacheManager {

    @Override
    public Collection<Cache> loadCaches() {

    }
}
