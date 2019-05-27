package com.shawny.configuration;

import com.shawny.config.ConfigMap;
import com.shawny.config.External;
import com.shawny.config.Internal;
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
    public External externalConfig(){
        External external = new External();
        external.setChanger("1");
        external.setType("2");
        return external;
    }

    @Bean
    public Internal internalConfig(){
        Internal internal = new Internal();
        internal.setChanger("1");
        internal.setType("11");
        return internal;
    }

    @Bean
    public ConfigMap configMap(){
        ConfigMap configMap = new ConfigMap();
        configMap.setExternal(externalConfig());
        configMap.setInternal(internalConfig());
        return configMap;
    }
}
