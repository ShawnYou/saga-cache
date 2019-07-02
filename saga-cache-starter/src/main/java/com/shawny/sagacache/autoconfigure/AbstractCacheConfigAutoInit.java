package com.shawny.sagacache.autoconfigure;


import com.shawny.sagacache.config.SagaCacheProperties;
import com.shawny.sagacache.core.CacheBuilder;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shawn_lin on 2019/5/18.
 */

public abstract class AbstractCacheConfigAutoInit implements InitializingBean{

    @Autowired
    private SagaCacheProperties sagaCacheProperties;

    private List<CacheBuilder> cacheBuilders = new ArrayList<>();

    private boolean isInit = false;

    @Override
    public void afterPropertiesSet() throws Exception {


        if(!isInit){
            synchronized (this){
                doProcess(sagaCacheProperties);
            }
        }

    }

    private void doProcess(SagaCacheProperties sagaCacheProperties){
        SagaCacheProperties.ExternalProperty externalProperty = sagaCacheProperties.getExternal();
        SagaCacheProperties.InternalProperty internalProperty = sagaCacheProperties.getInternal();
        cacheBuilders.add(createCacheBuilder(sagaCacheProperties));

    }

    protected abstract CacheBuilder createCacheBuilder(SagaCacheProperties sagaCacheProperties);




}
