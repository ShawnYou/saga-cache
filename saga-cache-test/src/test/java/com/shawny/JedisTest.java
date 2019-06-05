package com.shawny;

import org.junit.Assert;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class JedisTest {
    @Test
    public void test_simple_jedis_operation(){
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("hello","world");

        String str = jedis.get("hello");
        Assert.assertTrue("world".equals(str));
    }

    @Test
    public void test_jedis_pool_operation(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(30);
        config.setMinIdle(10);

        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        Jedis jedis = jedisPool.getResource();

        jedis.set("name","zhangsan");
        String name = jedis.get("name");
        Assert.assertTrue("zhangsan".equals(name));
    }
}
