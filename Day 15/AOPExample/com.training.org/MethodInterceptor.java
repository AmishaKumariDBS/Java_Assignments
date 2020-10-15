package com.training.org;

import org.aopalliance.intercept.MethodInvocation;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class MethodInterceptor implements org.aopalliance.intercept.MethodInterceptor{
    boolean add = true;
    FileHandler f = new FileHandler("logfile.log", add);
    Logger l = Logger.getLogger("com.training.org");
    l.addHandler(f);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object obj;
        l.info("Additional Concern before actual logic");
        obj=invocation.proceed();
        l.info("Additional cocern after actual logic");
        return null;
    }

}