package com.designpatterns.model;

import com.designpatterns.abstractmodel.Fool;

public class MagicApple implements Fool {

	@Override
	public void eat() {
		System.out.println("魔法苹果，你死定了");

	}

}
