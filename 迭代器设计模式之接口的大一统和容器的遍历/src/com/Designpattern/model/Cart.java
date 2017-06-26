package com.Designpattern.model;

public class Cart {
	int id;

	public Cart(int id) {
		super();
		this.id = id;
	};
	@Override
	public String toString(){
		return "车的id："+id;
	}
}
