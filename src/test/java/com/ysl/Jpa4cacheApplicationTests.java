package com.ysl;

import com.ysl.core.eliminateAlgorithm.LFUCache;
import com.ysl.core.eliminateAlgorithm.LRUCache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jpa4cacheApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void localCacheTest(){
		LRUCache lruMap = new LRUCache(3);

		lruMap.put(1,2);
		lruMap.put(2,3);
		lruMap.put(3,4);
		lruMap.put(4,5);

		Assert.assertEquals(3,lruMap.size());
	}


	/**
	 *
	 */
	@Test
	public void lfuTest(){
		LFUCache lfuCache = new LFUCache(3);
		lfuCache.putValue(1,1);
		lfuCache.putValue(2,2);
		lfuCache.putValue(3,3);

		lfuCache.getValue(1);
		lfuCache.getValue(1);
		lfuCache.getValue(2);
		lfuCache.getValue(2);
		lfuCache.getValue(3);

		lfuCache.putValue(4,4);

		Assert.assertEquals(null,lfuCache.get(3));
	}
}
