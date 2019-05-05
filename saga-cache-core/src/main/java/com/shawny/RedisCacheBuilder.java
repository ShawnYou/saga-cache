package com.shawny;


import com.sun.tools.javac.util.Assert;

/**
 * Created by shawn_lin on 2019/5/1.
 */
public class RedisCacheBuilder extends AbstractRemoteCacheBuilder{
    private RedisCacheConfig redisCacheConfig;

    public RedisCacheBuilder(RedisCacheConfig redisCacheConfig){
        Assert.checkNonNull(redisCacheConfig);
        this.redisCacheConfig = redisCacheConfig;
    }
}
