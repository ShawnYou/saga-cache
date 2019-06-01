package com.shawny.core;

import com.shawny.config.ExternalConfig;
import com.shawny.config.SagaCacheConfig;

/**
 * Created by shawn_lin on 2019/5/30.
 */
public class RedisCache extends AbstractCache{

    private ExternalConfig external;

    public RedisCache(SagaCacheConfig config, ExternalConfig external) {
        super(config);
        this.external = external;
    }

    @Override
    public <T> T GET(Object key) {
        return null;
    }
}
