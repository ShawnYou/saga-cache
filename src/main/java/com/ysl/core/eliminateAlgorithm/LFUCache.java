package com.ysl.core.eliminateAlgorithm;

import com.ysl.core.InnerCache;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 *  LFU cache
 *
 *  //TODO 并发情况（？）
 */
public class LFUCache<K,V> extends HashMap<K,V> implements InnerCache<K,V>{
    private static final int DEFAULT_CAPACITY = 5;

    private static final int MAX_SIZE = 3;

    private int capacity;

    Map<K,HitRate> hitRateMap = new HashMap<K,HitRate>();

    public LFUCache(){
        this(DEFAULT_CAPACITY);
    }

    public LFUCache(int capacity){
        super(capacity);
        this.capacity = capacity;
    }

    private K getLeastFrequencyEntry(){
        HitRate min = Collections.min(hitRateMap.values());
        return min.key;
    }

    @Override
    public Object getValue(Object key) {
        V v = get(key);
        if(v != null){
            HitRate hitRate = hitRateMap.get(key);
            hitRate.hitCount++;
            hitRate.time = System.currentTimeMillis();
        }
        return v;
    }

    @Override
    public Map getAllValues(Collection keys) {
        //TODO
        return null;
    }

    @Override
    public V putValue(K key, V value) {

        while (hitRateMap.size()>=MAX_SIZE){
            K minKey = getLeastFrequencyEntry();
            remove(minKey);
            hitRateMap.remove(minKey);
        }

        super.put(key,value);
        hitRateMap.put(key,new HitRate(key,1,System.currentTimeMillis()));
        return value;
    }

    @Override
    public void putAllValues(Map map) {
        //TODO
    }

    @Override
    public void removeAllValues(Collection keys) {
        //TODO
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class HitRate implements Comparable<HitRate>{
        private K key;
        private Integer hitCount;
        private Long time;

        @Override
        public int compareTo(HitRate o) {
            int ret = hitCount.compareTo(o.getHitCount());
            return ret!=0 ? ret:time.compareTo(o.getTime());
        }
    }
}
