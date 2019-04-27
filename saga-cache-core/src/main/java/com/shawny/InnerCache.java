package com.shawny;

import java.util.Collection;
import java.util.Map;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public interface InnerCache<K,V> {
    /**
     * put vaule to cache
     * @param k
     * @return
     */
    V put(K k);

    /**
     * get cache
     * @param k
     * @return
     */
    V get(K k);

    /**
     * remove cache by key
     * @param k
     * @return
     */
    V remove(K k);

    /**
     * get all caches by keys
     * @param keys
     * @return
     */
    Map<K,V> getAll(Collection keys);

    /**
     * batch put cache
     * @param map
     */
    void putAll(Map<K,V> map);

    /**
     * remove all cache by keys
     * @param keys
     */
    void removeAll(Collection keys);

}
