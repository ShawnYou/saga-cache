package com.shawny;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertySources;
import org.springframework.core.io.ClassPathResource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shawn_lin on 2019/5/28.
 */

@Configuration
public class AutoInitConfiguration {

    @Bean
    public Map<String,Object> properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
        yaml.setResources(new ClassPathResource("application.yml"));
        configurer.setProperties(yaml.getObject());
        PropertySources propertySources = configurer.getAppliedPropertySources();
        for (PropertySource<?> source : propertySources) {
            if(source instanceof EnumerablePropertySource){
                for(String name:((EnumerablePropertySource<?>)source).getPropertyNames()){
                    if(name !=null && name.startsWith("saga-cache")){

                    }
                }
            }
        }
        //return configurer;
        Map<String,Object> map = new HashMap<>();
        map.put("11",2);
        return map;
    }



}
