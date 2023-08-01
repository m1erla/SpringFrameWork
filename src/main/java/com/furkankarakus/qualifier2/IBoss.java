package com.furkankarakus.qualifier2;

public interface IBoss {
    //@Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    //@@ualifier  : aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz.
    public String version(String data);
}
