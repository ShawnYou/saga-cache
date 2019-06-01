package com.shawny.core;

import org.springframework.lang.Nullable;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public interface Cache {
     CacheWrap getCache(Object key);

     void putCache(Object key,Object value);

     void deleteCache(Object key);

     @FunctionalInterface
     public interface CacheWrap {
         @Nullable
         Object get();
     }
}
