package com.shawny.core;

import com.shawny.config.CacheConfig;
import com.shawny.config.SagaCacheConfig;
import org.springframework.cache.Cache;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public abstract class AbstractBuilder {

    protected SagaCacheConfig sagaCacheConfig;

    public AbstractBuilder(SagaCacheConfig sagaCacheConfig){
        this.sagaCacheConfig = sagaCacheConfig;
    }

    public abstract CacheConfig getConfig();

    public abstract Cache buildCache();


}
