package com.furkankarakus.qualifier;

import com.furkankarakus.qualifier2.EnumMoreOptions;
import com.furkankarakus.qualifier2.QualifierMultiple2;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Worker extends Boss2{
    //defaultta çalışacak kodlar
//    @Inject
//    private IBoss iBoss;

    //defaultta çalışacak kodlar
    //@QualifierMultiple wildfly yeni surumlerde yazmamiza gerek yok
    @Inject
    private IBoss iBoss;
    public String getData(String data){
        return iBoss.version(data);
    }
}
