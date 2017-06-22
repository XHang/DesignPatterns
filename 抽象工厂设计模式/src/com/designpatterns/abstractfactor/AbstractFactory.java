package com.designpatterns.abstractfactor;

import com.designpatterns.abstractmodel.Fool;
import com.designpatterns.abstractmodel.Moveable;
/**
 * 抽象工厂
 * @author Mr-hang
 *
 */
public interface AbstractFactory {
	public Fool getFool();
	public Moveable getMoveable();
}
