package com.shawn.cache;


import java.util.Collection;
import java.util.Map;

/**
 * Abstract cache implements
 */
public abstract class AbstractJpaCache implements JpaCache{

    public Object get(Object key) {
        return null;
    }

    public void put(Object key, Object value) {

    }

    public boolean remove(Object key) {
        return false;
    }

    public void clear() {

    }

    protected abstract Object getCache(Object key);

    protected abstract Object putCache(Object key,Object value);

    protected abstract boolean removeCache(Object key);

    protected abstract Map getAllcache(Collection keys);


}
