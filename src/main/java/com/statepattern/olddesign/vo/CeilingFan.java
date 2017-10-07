package com.statepattern.olddesign.vo;
/**
 * 状态模式
 * @author Administrator
 *
 */
public class CeilingFan {
	/**
	 * 定义风扇的档位
	 */
	private int gear;
	
	/**
	 * 风扇的加档位方法
	 * 需要很多if判断，很不直观
	 */
	public void pull(){
		if(gear==0){
			gear=1;
			System.out.println("风扇加一档,当前为"+gear+"档");
		}else if(gear==1){
			gear=2;
			System.out.println("风扇加一档,当前为"+gear+"档");
		}else if(gear==2){
			gear=3;
			System.out.println("风扇加一档,当前为"+gear+"档");
		}else{
			gear=0;
			System.out.println("风扇停止,当前为"+gear+"档");
		}
	}

}
