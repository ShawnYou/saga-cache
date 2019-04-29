package com.shawny;

import com.shawny.eliminateAlgorithm.SelectCacheCode;

/**
 * Created by shawn_lin on 2019/4/29.
 */
public abstract class AbstractCacheBuilder implements Builder{

    public abstract void buildPool();

    public abstract void buildConfig();

    @Override
    public Cache createCache() {
        return null;
    }
}
