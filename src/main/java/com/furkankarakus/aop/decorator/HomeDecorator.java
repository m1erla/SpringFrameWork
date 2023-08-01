package com.furkankarakus.aop.decorator;

import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;

@Decorator
@Default
@Dependent
abstract public class HomeDecorator implements IHome{

    private @Inject @Delegate IHome iHome;


    @Override
    public String dry(String data) {
        System.out.println("Decorator was here!!!");
        String dataInformation = iHome.dry(data);

        if (dataInformation.equals("spring framework")){
            dataInformation = dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
