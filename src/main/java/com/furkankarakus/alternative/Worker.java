package com.furkankarakus.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativeDi")
@ApplicationScoped
public class Worker extends Boss2{
    @Inject
    private IBoss iBoss;
    public String getData(String data){
        return iBoss.version(data);
    }
}
