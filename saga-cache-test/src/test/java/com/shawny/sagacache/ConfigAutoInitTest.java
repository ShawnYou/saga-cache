package com.shawny.sagacache;


import com.shawny.sagacache.config.SagaCacheProperties;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn_lin on 2019/6/10.
 */

public class ConfigAutoInitTest extends BaseTest{

    @Test
    public void test_config_init(){
        SagaCacheProperties.ExternalProperty externalProperty = sagaCacheProperties.getExternal();
        SagaCacheProperties.InternalProperty internalProperty = sagaCacheProperties.getInternal();
        Assert.assertTrue("redis".equals(externalProperty.getType())&&"hashmap".equals(internalProperty.getType()));
    }
}
