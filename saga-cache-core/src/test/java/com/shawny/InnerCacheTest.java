package com.shawny;

import com.shawny.eliminateAlgorithm.LRUCache;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by shawn_lin on 2019/4/27.
 */
public class InnerCacheTest {
    private LRUCache lruCache = null;

    @Before
    public void init(){
        lruCache = new LRUCache();
    }

    @Test
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

    }
}
