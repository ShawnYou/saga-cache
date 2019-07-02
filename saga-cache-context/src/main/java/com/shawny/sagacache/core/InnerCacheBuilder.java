package com.shawny.sagacache.core;

import com.shawny.sagacache.config.ConfigBase;
import com.shawny.sagacache.config.InnerCacheConfig;
import com.shawny.sagacache.config.SagaCacheProperties;
import com.shawny.sagacache.core.algorithm.FIFOCache;
import com.shawny.sagacache.core.algorithm.LRUCache;
import org.springframework.util.Assert;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class InnerCacheBuilder extends AbstractBuilder {

    private InnerCacheConfig innerCacheConfig;

    public InnerCacheBuilder(SagaCacheProperties sagaCacheProperties) {
        super(sagaCacheProperties);
        this.innerCacheConfig = (InnerCacheConfig)getConfig();
        this.setCacheFunction(config -> new InnerCache(innerCacheConfig));
    }

    @Override
    public ConfigBase getConfig() {
        return getInnerCacheConfig(sagaCacheProperties);
    }

    private InnerCacheConfig getInnerCacheConfig(SagaCacheProperties sagaCacheProperties){
        Cache cache = null;
        SagaCacheProperties.InternalProperty internal = sagaCacheProperties.getInternal();
        String strategy= internal.getStrategy();
        Assert.notNull(strategy,"the configuration about internal cache strategy is null");
        if("LRU".equalsIgnoreCase(strategy)){
            cache = new LRUCache();
        }else if("FIFO".equalsIgnoreCase(strategy)){
            cache = new FIFOCache();
        }
        InnerCacheConfig innerCacheConfig = new InnerCacheConfig();
        innerCacheConfig.setCacheSelector(cache);
        innerCacheConfig.setStrategy(internal.getStrategy());
        return innerCacheConfig;
    }
}
