package com.shawny;



/**
 * Created by shawn_lin on 2019/5/1.
 */
public class RedisCacheBuilder extends AbstractRemoteCacheBuilder{
    private RedisCacheConfig redisCacheConfig;

    public RedisCacheBuilder(RedisCacheConfig redisCacheConfig){
        this.redisCacheConfig = redisCacheConfig;
    }
}
