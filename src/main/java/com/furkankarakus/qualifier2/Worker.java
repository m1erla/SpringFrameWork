package com.furkankarakus.qualifier2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier2Cdi")
@ApplicationScoped
public class Worker extends Boss4{
    //defaultta çalışacak kodlar
//    @Inject
//    private IBoss iBoss;

    //defaultta çalışacak kodlar
    @Inject
    //@QualifierMultiple2(EnumMoreOptions.FIRST)wildfly yeni surumunde yazmamiza gerek yok extends etmemiz yeterli
    private IBoss iBoss;
    public String getData(String data){
        return iBoss.version(data);
    }
}
