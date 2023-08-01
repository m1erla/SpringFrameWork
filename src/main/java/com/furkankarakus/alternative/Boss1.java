package com.furkankarakus.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative // ayni anda sadece 1 tane proje calisiyor digerleri kapali
public class Boss1 implements IBoss {
    @Override
    public String version(String data) {
        return "boss1 -> " + data;
    }
}
