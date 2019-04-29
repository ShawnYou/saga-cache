package com.shawny;

import com.shawny.eliminateAlgorithm.LRUCache;

/**
 * Created by shawn_lin on 2019/4/29.
 */
public class LRUCacheBuilder extends InnerCacheBuilder{
    @Override
    public Cache build() {
        return new LRUCache();
    }
}
