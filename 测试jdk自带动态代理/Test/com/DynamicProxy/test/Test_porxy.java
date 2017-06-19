package com.DynamicProxy.test;

import java.lang.reflect.Proxy;
/*
 * 测试能不能拿到代理对象
 */
public class Test_porxy {
	public static void main(String[] args) {
		//参数解释：第一个参数是ClassLoader,毕竟实际上还是有代理类产生，需要把它load进内存。必须使用被代理对象的classload
		//第二个参数是被代理类的接口
		//第三个参数是实现了InvocationHandler接口的子类。具体实现细节请去参考此子类。
		Save s=(Save)Proxy.newProxyInstance(Save.class.getClassLoader(), new Class[]{Save.class}, new LogHandler());
		s.Save_1();			//看是否OK
	}
}
