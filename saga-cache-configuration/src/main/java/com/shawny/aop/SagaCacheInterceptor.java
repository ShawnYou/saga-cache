package com.shawny.aop;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cache.annotation.CachePut;
import org.springframework.core.BridgeMethodResolver;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;
import java.util.Collection;


/**
 * Created by shawn_lin on 2019/5/8.
 */
public class SagaCacheInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(final MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();

        try {
            return this.execute(methodInvocation,method,methodInvocation.getArguments(),methodInvocation.getThis());
        }catch (Throwable throwable){
            throw throwable;
        }

    }

    private Object execute(MethodInvocation invocation,Method method,Object[] args,Object target){
        Object object = invocation.getThis();
        Class<?> targetClass = target.getClass();
        Method specificMethod = ClassUtils.getMostSpecificMethod(method,targetClass);
        specificMethod = BridgeMethodResolver.findBridgedMethod(specificMethod);
        Collection<CachePut> cachePuts = AnnotatedElementUtils.findAllMergedAnnotations(specificMethod, CachePut.class);
        return null;
    }
}
