package com.shawny.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by shawn_lin on 2019/5/20.
 */
@Data
@Component
public class SagaCacheConfig {
    private External external;
    private Internal internal;
}
