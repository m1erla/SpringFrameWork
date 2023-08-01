package com.furkankarakus.interceptor;
@InterceptorRoadInterrupt
public class Login {

    public String isLoginMethod(String data){
        return "isLogin : " + data;
    }
}
