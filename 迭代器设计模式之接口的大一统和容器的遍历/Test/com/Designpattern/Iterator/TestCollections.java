package com.Designpattern.Iterator;

import org.junit.Test;

import com.Designpattern.model.Cart;

public class TestCollections {
	@Test
	public void tetsAdd(){
		Collections ar=new LinkedList();
		for(int i=0;i<15;i++){
			ar.add(new Cart(i));
		}
		Iterator iterator=ar.iterator();
		while(iterator.hashnext()){
			System.out.println((Cart)iterator.next());
		}
	}
}
