package com.shawny;

/**
 * Created by shawn_lin on 2019/5/1.
 */
public class GuavaCache<K,V> extends AbstractMemoryCache<K,V>{
    @Override
    protected V PUT(K k, V v) {
        return null;
    }

    @Override
    protected V GET(K k) {
        return null;
    }

    @Override
    protected V REMOVE(K k) {
        return null;
    }
}
