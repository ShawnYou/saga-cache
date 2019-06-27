package com.shawny.sagacache.annotation;

import java.lang.annotation.*;

/**
 * Created by shawn_lin on 2019/5/8.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface CachePut {
    /**
     * cache name
     * @return
     */
    String cacheName();
}
