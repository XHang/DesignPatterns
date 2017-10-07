package com.statepattern.olddesign.vo;

import org.junit.Test;

public class CeilingFanTest {
	
	@Test
	public void testPull() throws InterruptedException{
		CeilingFan fan = new CeilingFan();
		while(true){
			Thread.sleep(1000L);
			fan.pull();
		}
	}
}
