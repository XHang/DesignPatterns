package com.strategy.strategy;

/**
 * 策略2--下馆子，吃豪华泡面
 * 
 * @author Mr-hang
 *
 */
public class AtRestaurantEat implements Eatlunch {

	@Override
	public void eatlunch() {
		System.out.println("下馆子，就是为了吃豪华泡面（认真脸）");
	}

}
