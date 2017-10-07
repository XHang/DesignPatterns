package com.statepattern.newdesign.vo;

import org.junit.Test;

public class CeilingFanTest {
	
	@Test
	public void testPull() throws InterruptedException{
		CeilingFan fan = new CeilingFan();
		 int x = 10 ;
	        double y = 20.2 ;
	        long z = 10L; 
		String str = "" +( x + y * z) ;
		while(true){
			Thread.sleep(1000L);
			fan.pull();
		}
	}
}
