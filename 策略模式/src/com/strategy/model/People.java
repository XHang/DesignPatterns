package com.strategy.model;

import com.strategy.strategy.Eatlunch;

public class People {
	/**
	 * 名字
	 */
	private String userName;

	/**
	 * 年龄
	 */
	private int age;

	public People(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	/**
	 * 执行吃午餐命令,具体到底想吃什么就传什么策略的实现类
	 */
	public void eatLunch(Eatlunch execute) {
		execute.eatlunch();
	}

	/**
	 * 得到名字
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置名字
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
