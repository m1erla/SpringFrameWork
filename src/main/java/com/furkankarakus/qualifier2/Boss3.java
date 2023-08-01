package com.furkankarakus.qualifier2;


@QualifierMultiple2(EnumMoreOptions.SECOND)
public class Boss3 implements IBoss {
    @Override
    public String version(String data){
    return "QualifierMultiple Enum Second -> " + data;
    }
}
