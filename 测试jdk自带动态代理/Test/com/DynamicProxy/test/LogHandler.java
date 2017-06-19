package com.DynamicProxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 处理业务逻辑的类，如果把动态代码形容成汉堡包的话<br>
 * 被代理的类就是汉堡包里面的馅。而这个类就是汉堡包的两个夹层<br>
 * 这个处理类需要实现InvocationHandler接口。
 * @author Mr-hang
 *
 */
public class LogHandler implements InvocationHandler {
	Save s=new SaveImp();	//被代理对象也可以放在构造函数进行初始化，在newLogHandler时指定
	/**
	 * 处理方法，该方法是jdk动态代理时会自动调用的
	 * 其中
	 * @param proxy 调用该方法的代理实例
	 * @param 被代理对象的实际方法，
	 * @param 被代理对象的实际方法可能需要的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("日志记录开始");
		//执行原被代理对象的方法，第一个参数是被代理对象，第二个参数是参数集
		method.invoke(s, args);				
		System.out.println("日志记录结束");
		//被代理对象方法的返回值。所以实际上你应该接受invoke返回的数据在这里再次返回
		return null;						
	}

}
