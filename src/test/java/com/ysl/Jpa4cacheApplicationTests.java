package com.ysl;

import com.ysl.core.LRUMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jpa4cacheApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test1(){
		LRUMap lruMap = new LRUMap(3);

		lruMap.put(1,2);
		lruMap.put(2,3);
		lruMap.put(3,4);
		lruMap.put(4,5);

		List<Integer> keys = new ArrayList<Integer>();
		keys.add(1);
		keys.add(2);
		keys.add(3);
		Map map = lruMap.getAllValues(keys);

		Set<Integer> keySet = map.keySet();

		Assert.assertEquals(3,lruMap.size());
	}
}
