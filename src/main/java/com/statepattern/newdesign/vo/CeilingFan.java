package com.statepattern.newdesign.vo;
/**
 * 状态模式
 * @author Administrator
 *
 */
public class CeilingFan {
	/**
	 * 定义风扇的档位
	 */
	private State state;
	
	/**
	 * 风扇的加档位方法
	 * 调用当前状态的pull,具体什么状态就执行什么策略
	 */
	public void pull(){
		this.state.pull(this);
	}

	public void setState(State state) {
		this.state = state;
	}
	
	//风扇刚拿出来时，肯定是关闭状态的
	public CeilingFan(){
		this.state=new Off();
	}

}
