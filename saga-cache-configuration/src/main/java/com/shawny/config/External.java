package com.shawny.config;


import lombok.Data;

/**
 * Created by shawn_lin on 2019/5/19.
 */
@Data
public class External {
    private String type;
    private String changer;
    private String port;
    private String maxTotal;
    private String maxWaitMillis;
    private String maxIdle;
    private String host;
}
