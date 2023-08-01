package com.furkankarakus.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements IBoss {
    @Override
    public String version(String data){
    return "boss2 -> " + data;
    }
}
