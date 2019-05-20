package com.shawny.configuration;

import com.shawny.config.External;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shawn_lin on 2019/5/20.
 */
@Configuration
public class ExternalCacheConfigAutoInit extends CacheConfigAutoInit{

    public ExternalCacheConfigAutoInit(ApplicationContext context){
        super(context);
    }

    @Bean
    public External externalConfig(){
        External external = new External();
        external.setChanger(null);
        external.setType(null);
        return external;
    }
}
