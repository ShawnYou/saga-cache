package com.shawny.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by shawn_lin on 2019/5/20.
 */
public class internalCacheConfigAutoInit extends CacheConfigAutoInit{

    public internalCacheConfigAutoInit(ApplicationContext context) {
        super(context);
    }

}
