package com.shawny.sagacache.aop;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * Created by shawn_lin on 2019/5/8.
 */
public class CacheAdvisor extends AbstractBeanFactoryPointcutAdvisor{
    @Override
    public Pointcut getPointcut() {
        CachePointCut pointCut = new CachePointCut();
        return pointCut;
    }
}
