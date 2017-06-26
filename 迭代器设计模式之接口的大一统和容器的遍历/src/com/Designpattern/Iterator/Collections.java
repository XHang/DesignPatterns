package com.Designpattern.Iterator;
/**
 * 集合接口
 * @author Mr-hang
 *
 */
public interface Collections {

	public abstract void add(Object o);

	public abstract int size();
	public Iterator iterator(); 

}