package com.shawny;

import com.shawny.eliminateAlgorithm.LFUCache;

/**
 * Created by shawn_lin on 2019/4/29.
 */
public class LFUCacheBuilder extends InnerCacheBuilder{
    @Override
    public Cache build() {
        return new LFUCache();
    }
}
