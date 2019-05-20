package com.shawny.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shawn_lin on 2019/5/20.
 */
@Configuration
public class InternalCacheConfigAutoInit extends CacheConfigAutoInit{

    public InternalCacheConfigAutoInit(ApplicationContext context) {
        super(context);
    }

}
