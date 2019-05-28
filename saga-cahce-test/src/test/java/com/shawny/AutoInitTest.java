package com.shawny;

import com.shawny.config.External;
import com.shawny.config.Internal;
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

    private SagaCacheConfig cacheConfig;

    @Before
    public void init(){
        cacheConfig = new SagaCacheConfig();
        External external = new External();
        external.setChanger("T");
        external.setType("redis");

        Internal internal = new Internal();
        internal.setType("HashMap");
        internal.setChanger("T");

        cacheConfig.setExternal(external);
        cacheConfig.setInternal(internal);

    }

    @Test
    public void should_get_external_cache_when_project_init(){
        External external = cacheConfig.getExternal();
    }


}
