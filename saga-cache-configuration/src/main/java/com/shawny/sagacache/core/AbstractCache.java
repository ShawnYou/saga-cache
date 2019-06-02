package com.shawny.sagacache.core;

import com.shawny.sagacache.config.ConfigBase;
import org.springframework.util.Assert;

/**
 * Created by shawn_lin on 2019/5/30.
 */
public abstract class AbstractCache implements Cache {
    private ConfigBase configBase;

    public AbstractCache(ConfigBase configBase){
        Assert.notNull(configBase,"cache config base can not be null");
        this.configBase = configBase;
    }

    @Override
    public CacheWrap getCache(Object key) {
        return this.GET(key);
    }

    @Override
    public void putCache(Object key, Object value) {
        this.PUT(key,value);
    }

    @Override
    public void deleteCache(Object key) {
        this.DELETE(key);
    }

    public abstract CacheWrap GET(Object key);

    public abstract void PUT(Object key,Object value);

    public abstract void DELETE(Object key);
}
