package com.furkankarakus.aop.decorator;

public class Garden implements IHome{
    @Override
    public String dry(String data) {
        return data;
    }
}
