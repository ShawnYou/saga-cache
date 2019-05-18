package com.shawny;

import com.shawny.configuration.CacheConfigAutoInit;
import com.shawny.util.SpringContextHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shawn_lin on 2019/5/18.
 */
public class AutoInitTest{


    @Test
    public void shouldGenerateBeanWhenStart(){
        CacheConfigAutoInit configAutoInit = (CacheConfigAutoInit)SpringContextHelper.getContext().getBean("CacheConfigAutoInit");
        Assert.assertTrue(configAutoInit!=null);
    }
}
