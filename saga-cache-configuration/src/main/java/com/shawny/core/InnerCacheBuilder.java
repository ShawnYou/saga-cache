package com.shawny.core;

import com.shawny.config.ConfigBase;
import com.shawny.config.InnerCacheConfig;
import com.shawny.config.InternalConfig;
import com.shawny.config.SagaCacheConfig;
import com.shawny.core.algorithm.FIFOCache;
import com.shawny.core.algorithm.LRUCache;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class InnerCacheBuilder extends AbstractBuilder{

    private InnerCacheConfig innerCacheConfig;

    public InnerCacheBuilder(SagaCacheConfig cacheConfig) {
        super(cacheConfig);
        this.innerCacheConfig = getInnerCacheConfig(sagaCacheConfig);
        this.setCacheFunction(config -> new InnerCache(innerCacheConfig));
    }

    @Override
    public ConfigBase getConfig() {
        return innerCacheConfig;
    }

    private InnerCacheConfig getInnerCacheConfig(SagaCacheConfig sagaCacheConfig){
        Cache cache = null;
        InternalConfig internalConfig = sagaCacheConfig.getInternalConfig();
        String strategy= internalConfig.getStrategy();
        if("LRU".equalsIgnoreCase(strategy)){
            cache = new LRUCache();
        }else if("FIFO".equalsIgnoreCase(strategy)){
            cache = new FIFOCache();
        }
        InnerCacheConfig innerCacheConfig = new InnerCacheConfig();
        innerCacheConfig.setCacheSelector(cache);
        innerCacheConfig.setStrategy(internalConfig.getStrategy());
        return innerCacheConfig;
    }
}
