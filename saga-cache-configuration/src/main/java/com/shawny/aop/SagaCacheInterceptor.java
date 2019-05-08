package com.shawny.aop;



import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;


/**
 * Created by shawn_lin on 2019/5/8.
 */
public class SagaCacheInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        /*try {
            return methodInvocation.proceed();
        }catch (Throwable throwable){
            throw throwable;
        }*/

        try {
            return this.execute(methodInvocation,method,methodInvocation.getArguments(),methodInvocation.getThis());
        }catch (Throwable throwable){
            throw throwable;
        }

    }

    private Object execute(Invocation invocation,Method method,Object[] args,Object target){
        return null;
    }
}
