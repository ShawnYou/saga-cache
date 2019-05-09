package com.shawny.annotation;

import com.shawny.configuration.SagaCacheSeletor;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by shawn_lin on 2019/5/9.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
@Import(SagaCacheSeletor.class)
public @interface EnableSagaCache {
    boolean proxyTargetClass() default false;

    AdviceMode mode() default AdviceMode.PROXY;

    int order() default 2147483647;
}
