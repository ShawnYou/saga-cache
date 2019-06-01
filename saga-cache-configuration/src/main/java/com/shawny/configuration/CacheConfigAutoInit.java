package com.shawny.configuration;

import com.shawny.config.SagaCacheConfig;
import com.shawny.config.ExternalConfig;
import com.shawny.config.InternalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by shawn_lin on 2019/5/20.
 */
@Configuration
public class CacheConfigAutoInit extends AbstractCacheConfigAutoInit {

    @Autowired
    private ConfigurableEnvironment environment;

    @Bean
    public ExternalConfig externalConfig(){
        ExternalConfig external = new ExternalConfig();
        external.setChanger("1");
        external.setType("2");
        return external;
    }

    @Bean
    public InternalConfig internalConfig(){
        InternalConfig internal = new InternalConfig();
        internal.setChanger("1");
        internal.setType("11");
        return internal;
    }

    @Bean
    public SagaCacheConfig configMap(){
        SagaCacheConfig sagaCacheConfig = new SagaCacheConfig();
        sagaCacheConfig.setExternalConfig(externalConfig());
        sagaCacheConfig.setInternalConfig(internalConfig());
        return sagaCacheConfig;
    }
}
