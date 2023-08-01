package com.furkankarakus.aop.decorator;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean extends Garden{
    @Inject
    IHome iHome;

    public String beanMethod(String data){
        return iHome.dry("patika " + data);
    }

}
