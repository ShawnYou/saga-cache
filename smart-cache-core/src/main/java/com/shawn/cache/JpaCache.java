package com.shawn.cache;


/**
 *  Basic cache operation
 */
public interface JpaCache<K,V>{

    /**
     * get cache by cache key
     * @param key
     * @return
     */
    V get(K key);

    /**
     * put new cache
     * @param key
     * @param value
     */
    void put(K key, V value);

    /**
     * remove cache by cache key
     * @param key
     * @return
     */
    boolean remove(K key);

    /**
     * clear the cache
     */
    void clear();

}
