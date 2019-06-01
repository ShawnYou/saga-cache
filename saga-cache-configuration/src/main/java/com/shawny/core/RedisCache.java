package com.shawny.core;

import com.shawny.config.RedisConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by shawn_lin on 2019/5/30.
 */
public class RedisCache extends AbstractCache{
    private JedisPool jedisPool;

    public RedisCache(RedisConfig redisConfig) {
        super(redisConfig);
        this.jedisPool = redisConfig.getJedisPool();
    }

    @Override
    public CacheWrap GET(Object key) {
        try(Jedis jedis = jedisPool.getResource()) {
            String ret = jedis.get(key.toString());
            return ret!=null?new DefaultCacheWrap(ret):new DefaultCacheWrap(null);
        }catch (Exception e){
            throw new RuntimeException(String.format("get cache occurs exception,key:{}",key));
        }
    }

    @Override
    public void PUT(Object key, Object value) {
        try(Jedis jedis = jedisPool.getResource()) {
            String ret = jedis.set(key.toString(),value.toString());
            if(!"OK".equalsIgnoreCase(ret)){
                throw new RuntimeException(String.format("cache put occurs error,key:%s value:%s",key.toString(),value.toString()));
            }
        }catch (Exception e){
            throw new RuntimeException(String.format("cache put occurs error,key:%s value:%s",key.toString(),value.toString()));
        }
    }

    @Override
    public void DELETE(Object key) {
        try(Jedis jedis = jedisPool.getResource()) {
            jedis.del(key.toString());

        }catch (Exception e){
            throw new RuntimeException(String.format("cache put occurs error,key:%s",key.toString()));
        }
    }
}
