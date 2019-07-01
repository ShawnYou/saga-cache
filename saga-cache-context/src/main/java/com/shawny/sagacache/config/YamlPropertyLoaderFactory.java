package com.shawny.sagacache.config;


import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.lang.Nullable;

import java.io.IOException;

public class YamlPropertyLoaderFactory extends DefaultPropertySourceFactory{
    @Override
    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {
        if(resource == null){
            super.createPropertySource(name,resource);
        }
        return new YamlPropertySourceLoader().load(resource.getResource().getFilename(),resource.getResource()).get(0);
    }
}
