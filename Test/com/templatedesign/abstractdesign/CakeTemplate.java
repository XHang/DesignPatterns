package com.templatedesign.abstractdesign;

import java.sql.Connection;
import java.util.List;

import com.templatedesign.model.Cask;

/**
 *  演示蛋糕制作的模板抽象类
 * @author Administrator
 *
 */
 public abstract class  CakeTemplate{
	 
	 /**
	  * 制作蛋糕的模板方法
	  * @return
	  */
	 public Cask  makeCake(){
		 String msg="这是一个";
		 msg+=CakeTaste();
		 msg+="口味的，形状是爱心桃形状的蛋糕";
		 return new Cask(msg);
	 }
	 
	 /**
	  * 用户自己实现蛋糕的口味
	  * @return 口味
	  */
	 public abstract String CakeTaste();
	 
 }