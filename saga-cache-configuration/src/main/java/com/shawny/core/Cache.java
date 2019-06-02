package com.shawny.core;

import org.springframework.lang.Nullable;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public interface Cache<K,V> {
     CacheWrap getCache(Object key);

     void putCache(K key,V value);

     void deleteCache(Object key);

     @FunctionalInterface
     public interface CacheWrap {
         @Nullable
         Object get();
     }
}
