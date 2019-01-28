package com.shawn.cache;


import java.util.Collection;
import java.util.Map;

/**
 * Abstract cache implements
 */
public abstract class AbstractJpaCache implements JpaCache{

    @Override
    public Object get(Object key) {
        return getCache(key);
    }

    @Override
    public void put(Object key, Object value) {
        putCache(key,value);
        //TODO
    }

    @Override
    public boolean remove(Object key) {
        //TODO
        return false;
    }

    @Override
    public void clear() {

    }

    protected abstract Object getCache(Object key);

    protected abstract Object putCache(Object key,Object value);

    protected abstract boolean removeCache(Object key);

    protected abstract Map getAllcache(Collection keys);


}
