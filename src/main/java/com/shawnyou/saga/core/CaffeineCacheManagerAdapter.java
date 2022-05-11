package com.shawnyou.saga.core;

import org.springframework.cache.Cache;
import org.springframework.cache.caffeine.CaffeineCacheManager;

import com.shawnyou.saga.config.MultiCacheConfiguration;

/**
 * 适配器模式
 * 以本地缓存管理器的形式拥有caffeine缓存管理器的功能
 * 
 * @version 1.0 created by youshuanglin on 2022/4/4 6:49 下午
 */
public class CaffeineCacheManagerAdapter extends CaffeineCacheManager {
    private MultiCacheConfiguration multiCacheConfiguration;

    public CaffeineCacheManagerAdapter(MultiCacheConfiguration multiCacheConfiguration) {
        this.multiCacheConfiguration = multiCacheConfiguration;
    }

    @Override
    protected Cache createCaffeineCache(String name) {
        return super.createCaffeineCache(name);
    }

}
