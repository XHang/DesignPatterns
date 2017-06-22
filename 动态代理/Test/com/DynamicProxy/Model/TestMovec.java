package com.DynamicProxy.Model;

import javax.tools.JavaCompiler;
import javax.tools.Tool;
import javax.tools.ToolProvider;

import com.DynamicProxy.Proxy.Proxy;
import com.DynamicProxy.Proxy.TimeHandler;

/*
 * 测试程序
 */


public class TestMovec {
	public static void main(String[] args) throws Exception {
		testMove();
	}
	public static  void testMove() throws Exception{
		Moveable t=(Moveable)new Proxy().newProxyInstance(Moveable.class,new TimeHandler(new Tank()));;
		t.move();
		 
	}
}
