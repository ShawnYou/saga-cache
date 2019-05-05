package com.shawny;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.util.Pool;

/**
 * Created by shawn_lin on 2019/5/5.
 */
public class RedisCacheConfig extends Config{
    private Pool<Jedis> jedisPool;

    public Pool<Jedis> getJedisPool(){
        return this.jedisPool;
    }

    public void setJedisPool(Pool<Jedis> jedisPool){
        this.jedisPool = jedisPool;
    }
}
