package com.statepattern.newdesign.vo;

public class High  implements State{

	@Override
	public void pull(CeilingFan fan) {
		fan.setState(new Off());
		System.out.println("CeilingFan now is Off");
	}

}
