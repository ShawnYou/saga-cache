package com.shawny.annotation;

import com.shawny.configuration.SagaCacheSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by shawn_lin on 2019/5/19.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Import(SagaCacheSelector.class)
public @interface EnableAutoInit {
}
