package com.shawny;


/**
 * Created by shawn_lin on 2019/4/29.
 */
public abstract class InnerCacheBuilder implements Builder{
    @Override
    public Cache createCache() {
        return null;
    }

    public abstract Cache build();
}
