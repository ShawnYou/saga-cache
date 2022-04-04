package com.shawnyou.saga.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 多级缓存配置
 * 
 * @version 1.0 created by xxx on 2022/4/4 5:11 下午
 */
@Data
@Component
@ConfigurationProperties("saga.cache")
public class MultiCacheConfiguration {

}
