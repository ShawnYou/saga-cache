package com.shawny;

import com.shawny.sagacache.config.InternalConfig;
import com.shawny.sagacache.config.SagaCacheConfig;
import com.shawny.sagacache.core.Cache;
import com.shawny.sagacache.core.InnerCacheBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public class InnerCacheTest {

    private Cache cache;

    @Before
    public void init(){
        SagaCacheConfig cacheConfig = new SagaCacheConfig();

        InternalConfig internal = new InternalConfig();
        internal.setType("HashMap");
        internal.setChanger("T");
        internal.setStrategy("LRU");

        cacheConfig.setInternalConfig(internal);

        InnerCacheBuilder builder = new InnerCacheBuilder(cacheConfig);
        cache = builder.buildCache();
    }

    @Test
    public void should_put_value_into_cache(){
        cache.putCache("address","1111");
        Object address = cache.getCache("address").get();
        Assert.assertTrue("1111".equals(address.toString()));
    }

    /*

    @Test
    public void shouldReturnResultAfterBatchPut(){
        //List<String> inputData = Arrays.asList("tom","jerry");
        String inputName = "tom";
        Integer inputAge = 11;
        lruCache.put("name",inputName);
        lruCache.put("age",inputAge);


        Map<String,Object> map = lruCache.getAllValues(Arrays.asList("name","age"));
        assertTrue(map.size() == 2);
    }

    @Test
    public void shoudReturnTureWhenRemoveACache(){
        String inputName = "tom";
        Integer inputAge = 11;
        lruCache.put("name",inputName);
        lruCache.put("age",inputAge);

        lruCache.remove("name");

        Object object = lruCache.get("age");
        assertTrue(object!=null);
    }

    @Test
    public void shouldBuildCorrectCache(){
        InnerCacheBuilder builder = new InnerCacheBuilder(new FIFOCache());
        Cache cache = builder.createCache();
        assertTrue(cache instanceof FIFOCache);
    }

    @Test
    public void shouldBuildCorrectCache2(){
        InnerCacheBuilder builder = new InnerCacheBuilder(new LRUCache());
        Cache cache = builder.createCache();
        assertTrue(cache instanceof LRUCache);
    }*/
}
