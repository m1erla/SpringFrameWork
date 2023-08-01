package com.furkankarakus.ioc_di_without;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named(value = "withoutCdiWorker")
@ApplicationScoped
public class Worker {
   private Boss boss;

   public Worker(){
       boss = new Boss();
   }

   public String getData(String data){
       return boss.version(data);
   }
}
