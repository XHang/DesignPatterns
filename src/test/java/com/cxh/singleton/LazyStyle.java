package com.cxh.singleton;

/**
 * 单例设计模式的懒汉式
 * @author Administrator
 * 这种单例设计模式不会有安全问题。
 */
public class LazyStyle {
	//类初始化的时候就创建一个单例对象
	//好懒，先new一个对象，你们想要的话直接拿走吧，不要打扰我了
	static  LazyStyle  object=new LazyStyle();
	//构造函数私有，不允许其他调用方创建该类对象
	private LazyStyle(){};
	//获取单例的静态方法
	 static LazyStyle getInStance(){
		return object;
	}
}
