package com.statepattern.newdesign.vo;

public class Low  implements State{

	@Override
	public void pull(CeilingFan fan) {
		fan.setState(new Medium());
		System.out.println("CeilingFan now is Medium speed");
	}

}
