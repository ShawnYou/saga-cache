package com.shawny.configuration;


import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

/**
 * Created by shawn_lin on 2019/5/18.
 */
public abstract class AbstractCacheConfigAutoInit {

    protected ApplicationContext applicationContext;

    public AbstractCacheConfigAutoInit(ApplicationContext context){
        this.applicationContext = context;
    }

    @PostConstruct
    public void autoInit(){
        System.out.println("xxx");
    }

}
