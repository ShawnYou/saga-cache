package com.shawny.configuration;


import javax.annotation.PostConstruct;

/**
 * Created by shawn_lin on 2019/5/18.
 */
public class CacheConfigAutoInit {

    @PostConstruct
    public void autoInit(){
        System.out.println("xxx");
    }

}
