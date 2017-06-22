package com.DynamicProxy.Model;
import com.DynamicProxy.Model.*;
public class Tank_Porxy implements Moveable {
/*
 * 这个是用于计算坦克移动的时间代理类，使用聚合的动态代理
 */
	Moveable ma;
	public Tank_Porxy(Moveable ma) {
		super();
		this.ma = ma;
	}
	public void move() {
		long stare=System.currentTimeMillis();
		ma.move();
		long end =System.currentTimeMillis();
		System.out.println("运行时间="+(end-stare));

	}
	public Moveable getMa() {
		return ma;
	}
	public void setMa(Moveable ma) {
		this.ma = ma;
	}

}
