package com.statepattern.newdesign.vo;

public class Medium  implements State{

	@Override
	public void pull(CeilingFan fan) {
		fan.setState(new High());
		System.out.println("CeilingFan now is High speed");
	}

}
