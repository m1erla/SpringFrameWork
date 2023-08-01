package com.furkankarakus.qualifier;

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
    @Inject
    private IBoss iBoss;
    public String getData(String data){
        return iBoss.version(data);
    }
}
