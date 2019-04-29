package com.shawny;

import com.shawny.eliminateAlgorithm.FIFOCache;

/**
 * Created by shawn_lin on 2019/4/29.
 */
public class FIFOCacheBuilder extends InnerCacheBuilder{
    @Override
    public Cache build() {
        return new FIFOCache();
    }
}
