package com.furkankarakus.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorRoadInterrupt
public class InterceptorRoadInterruptMain {
   @AroundInvoke public Object logger(InvocationContext invocationContext){
   System.out.println("First status : " + invocationContext.getMethod().getName());

   // user
      boolean isLogin = true; // true :  yol kesici olacak degiskenimizin once login olmali
     // jdbc : session ?
      Object isContinue = null; // Eger yol kesilmezse devam edicegim

      if (isLogin){
         System.out.println("!!! First of all it need to login in the system.");
         return null;
      }else {
         try {
            isContinue = invocationContext.proceed(); // devam etmesini saglar.
            System.out.println("After status : " + isContinue);
         }catch (Exception e){
            System.out.println(e.getMessage());
         }
         return isContinue;
      }
   }

}
