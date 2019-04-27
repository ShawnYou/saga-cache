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
    V putValue(K k,V v);

    /**
     * get cache
     * @param k
     * @return
     */
    V getValue(K k);

    /**
     * remove cache by key
     * @param k
     * @return
     */
    V removeValue(K k);

    /**
     * get all caches by keys
     * @param keys
     * @return
     */
    Map<K,V> getAllValues(Collection<K> keys);

    /**
     * batch put cache
     * @param map
     */
    void putAllValues(Map<K,V> map);

    /**
     * remove all cache by keys
     * @param keys
     */
    void removeAllValues(Collection<K> keys);

    /**
     * remove eldest entry
     * @param eldest
     * @return
     */
    boolean removeEldestEntry(Map.Entry<K,V> eldest);

}
