package com.DynamicProxy.Proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {			//业务处理器接口
	//实现该接口的子类必须有一个构造方法，传入被代理的对象。
	public void invoke(Object o, Method m);
}
