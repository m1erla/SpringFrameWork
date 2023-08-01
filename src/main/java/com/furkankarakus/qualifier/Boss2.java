package com.furkankarakus.qualifier;


@QualifierMultiple
public class Boss2 implements IBoss {
    @Override
    public String version(String data){
    return "QualifierMultiple 1 -> " + data;
    }
}
