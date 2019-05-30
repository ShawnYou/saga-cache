package com.shawny;

import com.shawny.config.External;
import com.shawny.config.Internal;
import com.shawny.config.SagaCacheConfig;
import com.shawny.core.RedisCache;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shawn_lin on 2019/5/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AutoInitConfiguration.class})
public class AutoInitTest {

    private SagaCacheConfig cacheConfig;

    @Before
    public void init(){
        cacheConfig = new SagaCacheConfig();
        External external = new External();
        external.setChanger("T");
        external.setType("redis");
        external.setHost("127.0.0.1");
        external.setPort("6379");
        external.setMaxIdle("2");
        external.setMaxTotal("10");

        Internal internal = new Internal();
        internal.setType("HashMap");
        internal.setChanger("T");

        cacheConfig.setExternal(external);
        cacheConfig.setInternal(internal);

    }

    @Test
    public void should_get_redis_cache(){
        External external = cacheConfig.getExternal();
        RedisCache redisCache = new RedisCache(external);



    }


}
