package com.shawnyou.saga.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @version 1.0 created by youshuanglin on 2022/4/4 5:11 下午
 */
@Data
@Component
@ConfigurationProperties("saga.cache")
public class MultiCacheAutoConfiguration {

}
