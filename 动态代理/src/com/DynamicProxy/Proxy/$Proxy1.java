package com.DynamicProxy.Proxy;
import java.lang.reflect.Method;
public class $Proxy1 implements com.DynamicProxy.Model.Moveable{
    public $Proxy1(InvocationHandler h) {
        this.h = h;
    }
 com.DynamicProxy.Proxy.InvocationHandler h;
@Override
public void move() {
    try {
    Method md = com.DynamicProxy.Model.Moveable.class.getMethod("move");
    h.invoke(this, md);
    }catch(Exception e) {e.printStackTrace();}
}}