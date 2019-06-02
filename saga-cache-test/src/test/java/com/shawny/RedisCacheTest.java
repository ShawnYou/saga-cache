package com.shawny;

import com.shawny.sagacache.config.ExternalConfig;
import com.shawny.sagacache.config.InternalConfig;
import com.shawny.sagacache.config.SagaCacheConfig;
import com.shawny.sagacache.core.Cache;
import com.shawny.sagacache.core.RedisCacheBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shawn_lin on 2019/5/28.
 */

public class RedisCacheTest {

    private Cache cache;

    @Before
    public void init(){
        SagaCacheConfig cacheConfig = new SagaCacheConfig();
        ExternalConfig external = new ExternalConfig();
        external.setChanger("T");
        external.setType("redis");
        external.setHost("127.0.0.1");
        external.setPort(6379);
        external.setMaxIdle(2);
        external.setMaxTotal(10);

        InternalConfig internal = new InternalConfig();
        internal.setType("HashMap");
        internal.setChanger("T");

        cacheConfig.setExternalConfig(external);
        cacheConfig.setInternalConfig(internal);

        RedisCacheBuilder builder = new RedisCacheBuilder(cacheConfig);
        cache = builder.buildCache();

    }

    @Test
    public void should_get_redis_cache_instance(){
        cache.putCache("age","11");
        Object ret = cache.getCache("age").get();
        Assert.assertTrue("11".equals(ret.toString()));
    }

    @Test
    public void should_return_true_when_delete_cache(){
        cache.deleteCache("age");
        Object ret = cache.getCache("age").get();
        Assert.assertTrue(ret == null);
    }


}
