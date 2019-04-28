package com.shawny;


import java.util.Collection;
import java.util.Map;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public abstract class AbstractCache<K,V> implements Cache<K,V> {
    @Override
    public V putValue(K k, V v) {
        return null;
    }

    @Override
    public V getValue(K k) {
        return null;
    }

    @Override
    public V removeValue(K k) {
        return null;
    }

    @Override
    public Map<K, V> getAllValues(Collection<K> keys) {
        return null;
    }

    @Override
    public void putAllValues(Map<K, V> map) {

    }

    @Override
    public void removeAllValues(Collection<K> keys) {

    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return false;
    }

    protected abstract V putCache(K k,V v);

    protected abstract  V getCache(K k);

    protected abstract V removeCache(K k);
}
