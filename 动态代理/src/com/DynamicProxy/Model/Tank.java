package com.DynamicProxy.Model;

public class Tank implements Moveable{

	public void move() {
		System.out.println("Tank moveing.....");
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
