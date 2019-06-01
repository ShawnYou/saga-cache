package com.shawny.core;


import com.shawny.config.ConfigBase;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public class InnerCache extends AbstractCache {

    public InnerCache(ConfigBase configBase) {
        super(configBase);
    }

    @Override
    public CacheWrap GET(Object key) {
        return null;
    }

    @Override
    public void PUT(Object key, Object value) {

    }

    @Override
    public void DELETE(Object key) {

    }
}
