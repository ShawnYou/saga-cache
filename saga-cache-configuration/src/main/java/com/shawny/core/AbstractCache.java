package com.shawny.core;

import com.shawny.config.ConfigBase;
import org.springframework.util.Assert;

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
    public CacheWrap get(Object key) {
        return this.GET(key);
    }

    @Override
    public void put(Object key, Object value) {
        this.PUT(key,value);
    }

    public abstract CacheWrap GET(Object key);

    public abstract void PUT(Object key,Object value);
}
