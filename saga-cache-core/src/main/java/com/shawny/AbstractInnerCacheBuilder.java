package com.shawny;



/**
 * Created by shawn_lin on 2019/4/29.
 */
public abstract class AbstractInnerCacheBuilder implements Builder{

    @Override
    public Cache createCache() {
        return build();
    }

    protected abstract Cache build();
}
