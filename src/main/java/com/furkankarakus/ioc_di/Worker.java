package com.furkankarakus.ioc_di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "iocCdiWorker")
@ApplicationScoped
public class Worker extends Boss{
@Inject
private IBoss iBoss;

  public String getData(String data){
      return iBoss.version(data);
  }
}
