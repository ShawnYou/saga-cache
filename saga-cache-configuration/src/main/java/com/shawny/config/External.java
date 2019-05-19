package com.shawny.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by shawn_lin on 2019/5/19.
 */
@Component
@ConfigurationProperties(prefix = "saga-cache.external")
public class External {
    private String type;
    private String changer;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }
}
