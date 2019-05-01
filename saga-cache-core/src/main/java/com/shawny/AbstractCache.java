package com.shawny;


import java.util.Collection;
import java.util.Map;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public abstract class AbstractCache<K,V> implements Cache<K,V> {
    @Override
    public V putValue(K k, V v) {
        return this.PUT(k,v);
    }

    @Override
    public V getValue(K k) {
        return this.GET(k);
    }

    @Override
    public V removeValue(K k) {
        return this.REMOVE(k);
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

    protected abstract V PUT(K k,V v);

    protected abstract  V GET(K k);

    protected abstract V REMOVE(K k);
}
