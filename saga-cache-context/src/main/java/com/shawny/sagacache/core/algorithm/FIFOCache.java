package com.shawny.sagacache.core.algorithm;

import com.shawny.sagacache.core.Cache;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public class FIFOCache<K,V> implements Cache<K,V> {
    @Override
    public CacheWrap getCache(Object key) {
        return null;
    }

    @Override
    public void putCache(K key, V value) {

    }

    @Override
    public void deleteCache(Object key) {

    }

    /*@Override
    public Object putValue(Object o, Object o2) {
        return null;
    }

    @Override
    public Object getValue(Object o) {
        return null;
    }

    @Override
    public Object removeValue(Object o) {
        return null;
    }

    @Override
    public Map getAllValues(Collection keys) {
        return null;
    }

    @Override
    public void putAllValues(Map map) {

    }

    @Override
    public void removeAllValues(Collection keys) {

    }

    @Override
    public boolean removeEldestEntry(Map.Entry eldest) {
        return false;
    }*/
}
