package com.shawny.config;


import lombok.Data;

/**
 * Created by shawn_lin on 2019/5/19.
 */
@Data
public class ExternalConfig {
    private String type;
    private String changer;
    private Integer port;
    private Integer maxTotal;
    private long maxWaitMillis;
    private Integer maxIdle;
    private String host;
}
