package com.furkankarakus.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;

// Kapsam
// Yasam suresi
// Performansimizi + -
@Named
// @ApplicationScoped // Butun uygulama boyunca calisiyor
// @RequestScoped // 1 istek boyunca
// @SessionScoped // 1 kullanici icin yasar ancak logout
//@Dependent // bukelemon
//@ConversationScoped // belli istek boyunca yasar
// @SessionScoped // Bean 1 instance olmasini saglamak icin
public class _00_Scoped {
}
