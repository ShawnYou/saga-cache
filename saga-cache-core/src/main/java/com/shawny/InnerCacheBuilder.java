package com.shawny;


/**
 * Created by shawn_lin on 2019/4/29.
 */
public class InnerCacheBuilder extends AbstractInnerCacheBuilder {
    private InnerCache innerCache;

    public InnerCacheBuilder(InnerCache innerCache){
        this.innerCache = innerCache;
    }

    @Override
    protected Cache build() {
        return innerCache;
    }
}
