package com.training.org;

import org.aopalliance.intercept.MethodInvocation;

public class MethodInterceptor implements org.aopalliance.intercept.MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object obj;
        System.out.println("Additional Concern before actual logic");
        obj=invocation.proceed();
        System.out.println("Additional cocern after actual logic");
        return null;
    }

}