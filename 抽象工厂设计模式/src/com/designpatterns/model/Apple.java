package com.designpatterns.model;

import com.designpatterns.abstractmodel.Fool;

public class Apple implements Fool {

	@Override
	public void eat() {
		System.out.println("苹果，你死定了");

	}

}
