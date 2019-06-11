package com.shawny.sagacache;

import com.shawny.sagacache.annotation.EnableSagaCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by shawn_lin on 2019/6/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableSagaCache
public class ConfigAutoInitTest {
    @Test
    public void test(){
        System.out.println("have a test");
    }
}
