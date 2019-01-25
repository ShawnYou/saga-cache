package com.ysl.core;

import java.util.*;

/**
 *  local cache about LRU
 */
public class LRUMap extends LinkedHashMap implements InnerCache{
    private int capacity;

    public LRUMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    public Object getValue(Object key) {
        return get(key);
    }

    @Override
    public Map getAllValues(Collection keys) {
        Map ret = new HashMap();
        keys.forEach(key ->{
            Object value = get(key);
            if(value != null){
                ret.put(key,value);
            }
        });
        return ret;
    }

    @Override
    public void putValue(Object key, Object value) {
        put(key,value);
    }

    @Override
    public void putAllValues(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        entrySet.forEach(entry -> {
            put(entry.getKey(),entry.getValue());
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
