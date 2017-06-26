package com.Designpattern.Iterator;
/*
 * 迭代器类
 * 由于各个集合的取出元素方式不一样，故有必要对各个容器取出的接口进行统一定义。这样不管是什么容器都能获取到Iterator对象遍历容器。
 * 不用考虑内部实现。这就是迭代器设计模式
 */
public interface Iterator {
	public boolean hashnext();
	public Object next();

}
