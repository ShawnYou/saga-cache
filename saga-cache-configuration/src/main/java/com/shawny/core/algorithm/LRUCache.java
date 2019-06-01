package com.shawny.core.algorithm;


import com.shawny.core.Cache;

import java.util.LinkedHashMap;

/**
 * Created by shawn_lin on 2019/4/27.
 *
 * LRU 缓存淘汰算法
 *
 * TODO 并发
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> implements Cache {


    static final int DEFAULT_CAPACITY = 1 << 4;

    static final float DEFAULT_LOAD_FACTORY = 0.75f;

    private int capacity;

    public LRUCache(){
        super(DEFAULT_CAPACITY,DEFAULT_LOAD_FACTORY,true);
    }

    public LRUCache(int capacity){
        super(capacity,DEFAULT_LOAD_FACTORY,true);
        this.capacity = capacity;
    }

    @Override
    public CacheWrap getCache(Object key) {
        return null;
    }

    @Override
    public void putCache(Object key, Object value) {

    }

    @Override
    public void deleteCache(Object key) {

    }

    /*@Override
    public void putAllValues(Map<K, V> map) {
        Set<Map.Entry<K,V>> entries = map.entrySet();
        entries.forEach(entry ->{
            super.put(entry.getKey(),entry.getValue());
        });
    }*/



    /*@Override
    public Map<K, V> getAllValues(Collection<K> keys) {
        Map<K,V> retMap = new HashMap<>();
        keys.forEach(key ->{
            V value = super.get(key);
            if(value != null){
                retMap.put(key,value);
            }
        });
        return retMap;
    }

    @Override
    public void removeAllValues(Collection<K> keys) {
        keys.forEach(key->{
            super.remove(key);
        });
    }*/

    /*@Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        boolean status = false;
        if(size()>capacity){
            status = super.removeEldestEntry(eldest);
        }
        return status;
    }*/
}
