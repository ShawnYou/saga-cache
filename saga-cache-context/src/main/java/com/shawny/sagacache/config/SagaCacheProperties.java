package com.shawny.sagacache.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by shawn_lin on 2019/6/10.
 */
@Data
@Component
@ConfigurationProperties(prefix = "saga-cache")
public class SagaCacheProperties {
    private String enableMultiCache;
    private ExternalProperty external;
    private InternalProperty internal;

    @Data
    public static class ExternalProperty{
        private String type;
        private Integer port;
        private Integer maxTotal;
        private long maxWaitMillis;
        private Integer maxIdle;
        private String host;
    }

    @Data
    public static class InternalProperty{
        private String type;
        private String strategy;
    }
}
