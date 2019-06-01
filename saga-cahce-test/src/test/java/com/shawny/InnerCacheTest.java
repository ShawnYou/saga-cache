package com.shawny;

import com.shawny.config.ExternalConfig;
import com.shawny.config.InternalConfig;
import com.shawny.config.SagaCacheConfig;
import com.shawny.core.RedisCacheBuilder;
import org.junit.Before;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public class InnerCacheTest {

    @Before
    public void init(){
        SagaCacheConfig cacheConfig = new SagaCacheConfig();

        InternalConfig internal = new InternalConfig();
        internal.setType("HashMap");
        internal.setChanger("T");

        cacheConfig.setInternalConfig(internal);

        InnerCacheBuilder builder = new InnerCacheBuilder(cacheConfig);
    }

    /*@Test
    public void shouldReturnResultWhenUseLruCache(){
        lruCache.put("111",222);

        Integer value = (Integer)lruCache.get("111");
        assertTrue(value == 222);
    }

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
