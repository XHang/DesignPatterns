package com.strategy.strategy;

/**
 * 策略1：午餐在家吃泡面
 * 
 * @author Mr-hang
 *
 */
public class AtHomeEat implements Eatlunch {

	@Override
	public void eatlunch() {
		System.out.println("在家吃。。泡面");
	}

}
