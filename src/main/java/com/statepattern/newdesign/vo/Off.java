package com.statepattern.newdesign.vo;

public class Off  implements State{

	@Override
	public void pull(CeilingFan fan) {
		fan.setState(new Low());
		System.out.println("CeilingFan now is Low speed");
	}

}
