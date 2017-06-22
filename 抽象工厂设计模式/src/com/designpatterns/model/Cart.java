package com.designpatterns.model;

import com.designpatterns.abstractmodel.Moveable;

/*
 * 汽车交通工具类
 */
public class Cart implements Moveable {

	@Override
	public void move() {
		System.out.println("滴滴，刷卡上车");
	}

}
