package com.shawny;

import com.shawny.config.External;
import com.shawny.configuration.CacheConfigAutoInit;
import com.shawny.configuration.SagaCacheAutoConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shawn_lin on 2019/5/18.
 */

public class AutoInitTest {


    @Test
    public void shouldInjectBeanWhenProjectStart(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SagaCacheAutoConfiguration.class);
        ctx.refresh();
        CacheConfigAutoInit configAutoInit = ctx.getBean(CacheConfigAutoInit.class);
        Assert.assertTrue(configAutoInit!=null);
    }


    @Test
    public void shouldMapToObjectWhenProjectStart(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SagaCacheAutoConfiguration.class);
        ctx.refresh();
        External external = ctx.getBean(External.class);
        Assert.assertTrue(external !=null);
    }
}
