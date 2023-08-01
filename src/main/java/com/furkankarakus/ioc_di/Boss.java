package com.furkankarakus.ioc_di;

public class Boss implements IBoss{
    @Override
    public String version(String data) {
        return "version -> " + data;
    }
}
