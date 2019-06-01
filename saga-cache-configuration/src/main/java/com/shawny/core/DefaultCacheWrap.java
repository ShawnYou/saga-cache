package com.shawny.core;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class DefaultCacheWrap implements Cache.CacheWrap{
    private final Object value;

    public DefaultCacheWrap(Object value){
        this.value = value;
    }

    @Override
    public Object get() {
        return value;
    }
}
