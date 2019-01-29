package com.shawn.cache;

import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * config data
 */
public class ConfigData {
    private ConfigurableEnvironment environment;

    public <T> T getProperty(String key){
        return (T)environment.getProperty(key);
    }

    public Map<String,Object> getProperties(){
        return null;
    }

    public <T> T getProperty(String key,T defaultValue){
        if(containProperty(key)){
            return getProperty(key);
        }else {
            return defaultValue;
        }
    }

    public boolean containProperty(String key){
        return environment.containsProperty(key);
    }
}
