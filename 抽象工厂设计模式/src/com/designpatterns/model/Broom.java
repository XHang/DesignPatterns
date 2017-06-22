package com.designpatterns.model;

import com.designpatterns.abstractmodel.Moveable;

public class Broom implements Moveable {

	@Override
	public void move() {
		System.out.println("看，扫把飞过来了，撒飒飒");

	}

}
