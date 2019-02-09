package com.shawn.cache;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.util.Pool;

import java.util.Collection;
import java.util.Map;

/**
 * redis cache
 */
public class RedisCache extends AbstractExternalJapCache {
    private Pool<Jedis> jedisPool;

    public RedisCache(){
        /*GenericObjectPoolConfig jedisPoolConfig = new GenericObjectPoolConfig();
        JedisPoolConfig
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMinIdle(2);
        jedisPoolConfig.setMaxIdle(5);
        jedisPool = new JedisPool(jedisPoolConfig,"127.0.0.1",6379,1000);*/
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
    }

    @Override
    protected Object getCache(Object key) {
        Jedis jedis = jedisPool.getResource();

        return null;
    }

    @Override
    protected Object putCache(Object key, Object value) {
        return null;
    }

    @Override
    protected boolean removeCache(Object key) {
        return false;
    }

    @Override
    protected Map getAllcache(Collection keys) {
        return null;
    }
}
