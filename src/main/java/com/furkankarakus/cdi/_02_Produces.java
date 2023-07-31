package com.furkankarakus.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {
    @Produces // creating
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("HTML5");
        list.add("CSS3");
        list.add("JS");
        list.add("REACT");
        list.add("ANGULAR");
        return list;
    }
}
