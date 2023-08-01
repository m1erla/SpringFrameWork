package com.furkankarakus.qualifier2;


@QualifierMultiple2(EnumMoreOptions.THIRD)
public class Boss4 implements IBoss {
    @Override
    public String version(String data){
    return "QualifierMultiple Enum Third -> " + data;
    }
}
