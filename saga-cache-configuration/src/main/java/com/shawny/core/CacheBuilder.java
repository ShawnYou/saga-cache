package com.shawny.core;

import org.springframework.cache.Cache;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public interface CacheBuilder {
    Cache buildCache();
}
