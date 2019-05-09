package com.shawny.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Created by shawn_lin on 2019/5/8.
 */
public class CachePointCut extends StaticMethodMatcherPointcut implements ClassFilter{
    @Override
    public boolean matches(Class<?> aClass) {
        return true;
    }

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return true;
    }
}
