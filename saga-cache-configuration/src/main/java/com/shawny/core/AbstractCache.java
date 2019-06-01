package com.shawny.core;

import com.shawny.config.ConfigBase;
import com.shawny.config.SagaCacheConfig;
import org.springframework.cache.Cache;
import org.springframework.util.Assert;

import java.util.concurrent.Callable;

/**
 * Created by shawn_lin on 2019/5/30.
 */
public abstract class AbstractCache implements Cache{
    private ConfigBase configBase;

    public AbstractCache(ConfigBase configBase){
        Assert.notNull(configBase,"cache config base can not be null");
        this.configBase = configBase;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object getNativeCache() {
        return null;
    }

    @Override
    public ValueWrapper get(Object key) {
        return this.GET(key);
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T get(Object o, Callable<T> callable) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        this.PUT(key,value);
    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        return null;
    }

    @Override
    public void evict(Object o) {

    }

    @Override
    public void clear() {

    }

    public abstract ValueWrapper GET(Object key);

    public abstract void PUT(Object key,Object value);
}
