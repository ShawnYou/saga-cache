package com.shawny.config;

import lombok.Data;
import redis.clients.jedis.JedisPool;

/**
 * Created by shawn_lin on 2019/6/1.
 */
@Data
public class RedisCacheConfig extends ConfigBase {
    private JedisPool jedisPool;
}
