package com.shawny;

import com.shawny.config.SagaCacheConfig;
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

    @Before
    public void init(){
        SagaCacheConfig cacheConfig = new SagaCacheConfig();

    }

    @Test
    public void test(){

    }


}
