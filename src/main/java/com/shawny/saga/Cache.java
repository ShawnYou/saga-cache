package com.shawny.saga;


public interface Cache<K,V> {
    V get(K k);

    void add(K k);

    void delete(K k);
}
