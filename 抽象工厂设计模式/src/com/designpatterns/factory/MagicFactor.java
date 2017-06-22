package com.designpatterns.factory;

import com.designpatterns.abstractfactor.AbstractFactory;
import com.designpatterns.abstractmodel.Fool;

public class MagicFactor implements AbstractFactory {

	@Override
	public Fool getFool() {
		// TODO Auto-generated method stub
		return new MagicApple();
	}

	@Override
	public Moveable getMoveable() {
		// TODO Auto-generated method stub
		return new Broom();
	}

}
