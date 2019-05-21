package com.shawny;

import com.shawny.config.ConfigMap;
import com.shawny.configuration.AbstractCacheConfigAutoInit;
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
        AbstractCacheConfigAutoInit configAutoInit = ctx.getBean(AbstractCacheConfigAutoInit.class);
        Assert.assertTrue(configAutoInit!=null);
    }


    @Test
    public void shouldMapToObjectWhenProjectStart(){
        /*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CacheConfigAutoInit.class);
        ctx.refresh();
        ConfigMap configMap = ctx.getBean(ConfigMap.class);
        Assert.assertTrue(configMap.getExternal().getChanger() !=null);*/
    }

    @Test
    public void shouldGetCacheBuilderMapWhenProjectStart(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CacheConfigAutoInit.class);
        ctx.refresh();

    }


}
