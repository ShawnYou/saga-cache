package com.shawny.sagacache.aop;


import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

public class BeanFactoryCacheAdvisor extends AbstractBeanFactoryPointcutAdvisor{


    @Override
    public Pointcut getPointcut() {
        return null;
    }
}
