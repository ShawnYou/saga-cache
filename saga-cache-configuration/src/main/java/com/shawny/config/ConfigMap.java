package com.shawny.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by shawn_lin on 2019/5/20.
 */
@Component
@ConfigurationProperties("saga-cache")
public class ConfigMap {
    private External external;
    private Internal internal;
}
