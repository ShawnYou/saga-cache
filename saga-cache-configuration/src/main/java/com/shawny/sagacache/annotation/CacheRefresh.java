package com.shawny.sagacache.annotation;

import java.lang.annotation.*;

/**
 * Created by shawn_lin on 2019/5/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface CacheRefresh {
    long interval();
}
