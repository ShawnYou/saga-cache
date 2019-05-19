package com.shawny.configuration;


import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by shawn_lin on 2019/5/18.
 */
@Configuration
public class CacheConfigAutoInit {

    @PostConstruct
    public void autoInit(){
        System.out.println("xxx");
    }

}
