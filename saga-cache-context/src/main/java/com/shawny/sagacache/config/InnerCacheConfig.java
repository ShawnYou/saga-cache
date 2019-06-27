package com.shawny.sagacache.config;

import com.shawny.sagacache.core.Cache;
import lombok.Data;

/**
 * Created by shawn_lin on 2019/6/1.
 */
@Data
public class InnerCacheConfig extends ConfigBase{
    private String strategy;
    private Cache cacheSelector;
}
