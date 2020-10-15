package com.training.org;

import java.util.List;

public class ProxyFactoryBean {
    private Object target;
    private List InterceptorNames;

    public ProxyFactoryBean() {
        super();
    }


    public ProxyFactoryBean(Object target, List interceptorNames) {
        super();
        this.target = target;
        InterceptorNames = interceptorNames;
    }
    public Object getTarget() {
        return target;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
    public List getInterceptorNames() {
        return InterceptorNames;
    }
    public void setInterceptorNames(List interceptorNames) {
        InterceptorNames = interceptorNames;
    }



}

