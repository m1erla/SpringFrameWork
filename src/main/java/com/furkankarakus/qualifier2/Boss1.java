package com.furkankarakus.qualifier2;


import jakarta.enterprise.inject.Default;

@Default
public class Boss1 implements IBoss {
    @Override
    public String version(String data) {
        return "Default data  -> " + data;
    }
}
