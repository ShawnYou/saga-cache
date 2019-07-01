package com.shawny.sagacache.core;

import com.shawny.sagacache.config.ConfigBase;
import com.shawny.sagacache.config.SagaCacheProperties;

import java.util.function.Function;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public abstract class AbstractBuilder implements CacheBuilder {

    protected SagaCacheProperties sagaCacheProperties;

    private Function<ConfigBase,Cache> cacheFunction;

    public AbstractBuilder(SagaCacheProperties sagaCacheProperties){
        this.sagaCacheProperties = sagaCacheProperties;
    }

    public abstract ConfigBase getConfig();

    public void setCacheFunction(Function<ConfigBase,Cache> cacheFunction){
        this.cacheFunction = cacheFunction;
    }

    @Override
    public Cache buildCache() {
        ConfigBase configBase = this.getConfig();
        Cache cache = cacheFunction.apply(configBase);
        return cache;
    }
}
