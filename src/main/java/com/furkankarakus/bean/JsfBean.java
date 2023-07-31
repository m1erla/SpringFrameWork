package com.furkankarakus.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@RequestScoped
@Getter @Setter
public class JsfBean {
    private String patika;

    public JsfBean(){
        this.patika = "Welcome To The Spring Frame Work Education";
    }
}
