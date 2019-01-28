package com.ysl.core.eliminateAlgorithm;

import com.ysl.core.InnerCache;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  local cache about LRU
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> implements InnerCache<K,V>{
    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    public V getValue(K key) {
        return get(key);
    }

    @Override
    public Map getAllValues(Collection keys) {
        Map ret = new HashMap();
        keys.forEach(key ->{
            V value = get(key);
            if(value != null){
                ret.put(key,value);
            }
        });
        return ret;
    }

    @Override
    public V putValue(K key, V value) {
        put(key,value);
        return value;
    }

    @Override
    public void putAllValues(Map<K,V> map) {
        Set<Map.Entry<K,V>> entrySet = map.entrySet();
        entrySet.forEach(entry -> {
            super.put(entry.getKey(),entry.getValue());
        });
    }

    @Override
    public void removeAllValues(Collection keys) {
        keys.forEach(key->{
            remove(key);
        });
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>capacity;
    }
}
