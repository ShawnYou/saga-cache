package com.shawny.configuration;

import org.springframework.context.ApplicationContext;

/**
 * Created by shawn_lin on 2019/5/20.
 */
public class InternalCacheConfigAutoInit extends CacheConfigAutoInit{

    public InternalCacheConfigAutoInit(ApplicationContext context) {
        super(context);
    }

}
