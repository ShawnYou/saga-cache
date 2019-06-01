package com.shawny.core;

import org.springframework.lang.Nullable;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public interface Cache {
     CacheWrap get(Object key);

     void put(Object key,Object value);

     void delete(Object key);

     @FunctionalInterface
     public interface CacheWrap {
         @Nullable
         Object get();
     }
}
