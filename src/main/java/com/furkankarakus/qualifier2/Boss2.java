package com.furkankarakus.qualifier2;


@QualifierMultiple2(EnumMoreOptions.FIRST)
public class Boss2 implements IBoss {
    @Override
    public String version(String data){
    return "QualifierMultiple Enum First -> " + data;
    }
}
