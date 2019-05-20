package com.shawny.configuration;


import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;

/**
 * Created by shawn_lin on 2019/5/18.
 */
public abstract class AbstractCacheConfigAutoInit {

    private ConfigurableEnvironment environment;

    @PostConstruct
    public void autoInit(){
        System.out.println("xxx");
    }

}
