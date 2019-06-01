package com.shawny.core;

import com.shawny.config.ConfigBase;
import com.shawny.config.InnerCacheConfig;
import com.shawny.config.InternalConfig;
import com.shawny.config.SagaCacheConfig;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public class InnerCacheBuilder extends AbstractBuilder{

    private InnerCacheConfig innerCacheConfig;

    public InnerCacheBuilder(SagaCacheConfig cacheConfig) {
        super(cacheConfig);
        this.innerCacheConfig = getInnerCacheConfig(sagaCacheConfig);
        this.setCacheFunction(config -> new InnerCache(innerCacheConfig));
    }

    @Override
    public ConfigBase getConfig() {
        return innerCacheConfig;
    }

    private InnerCacheConfig getInnerCacheConfig(SagaCacheConfig sagaCacheConfig){
        InternalConfig internalConfig = sagaCacheConfig.getInternalConfig();

        InnerCacheConfig innerCacheConfig = new InnerCacheConfig();
        innerCacheConfig.setStrategy(internalConfig.getStrategy());
        return innerCacheConfig;
    }
}
