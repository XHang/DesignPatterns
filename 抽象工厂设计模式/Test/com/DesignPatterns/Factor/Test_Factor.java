package com.DesignPatterns.Factor;

import com.designpatterns.abstractfactor.AbstractFactory;
import com.designpatterns.abstractmodel.Fool;
import com.designpatterns.abstractmodel.Moveable;
import com.designpatterns.factory.MagicFactor;

public class Test_Factor {
	public void test_Factor(){
		AbstractFactory af=new MagicFactor();
		Fool f=af.getFool();
		Moveable M=af.getMoveable();
		M.move();
		f.eat();
	} 
	public static void main(String[] args) {
		new Test_Factor().test_Factor();
	}

}
