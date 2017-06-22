package com.designpatterns.factory;

import com.designpatterns.abstractfactor.AbstractFactory;
import com.designpatterns.abstractmodel.Fool;
import com.designpatterns.abstractmodel.Moveable;
import com.designpatterns.model.Apple;
import com.designpatterns.model.Cart;
/**
 * 现实事物的工厂类
 * @author Mr-hang
 *
 */
public class defaultFactor implements AbstractFactory {
	/**
	 * 生产现实世界的事务
	 */
	@Override
	public Fool getFool() {
		// TODO Auto-generated method stub
		return new Apple();
	}
	/**
	 * 生产现实世界的交通工具
	 */
	@Override
	public Moveable getMoveable() {
		// TODO Auto-generated method stub
		return new Cart();
	}

}
