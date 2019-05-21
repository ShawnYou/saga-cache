package com.shawny.configuration;

import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * Created by shawn_lin on 2019/5/21.
 */
public class ConfigurationParser {

    private static final String PREFIX = "saga-cache";

    private ConfigurableEnvironment environment;

    public ConfigurationParser(ConfigurableEnvironment environment){
        this.environment = environment;
    }

    Map<String,Object>  getProperties(){
        return null;
    }
}
