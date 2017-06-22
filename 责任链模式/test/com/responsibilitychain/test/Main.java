package com.responsibilitychain.test;

import com.responsibilitychain.filter.FilterChain;
import com.responsibilitychain.filter.HtmlFilter;
import com.responsibilitychain.filter.SensitiveFilter;
import com.responsibilitychain.webelement.Request;
import com.responsibilitychain.webelement.Respnose;

/*
 * 该类是执行类
 */
public class Main {
	//功能是过滤掉请求数据的敏感数据并往响应添加一点数据
	public static void main(String[] args) {
		Request request=new Request();					
		request.setStrrequest("蛤蛤蛤，<我是有害脚本程序>，续一秒");
		Respnose respnose=new Respnose();
		respnose.setStrrespnose("反馈信息。");
		FilterChain fc=new FilterChain();
		fc.addFilter(new HtmlFilter());
		fc.addFilter(new SensitiveFilter());
		fc.doFilter(request, respnose, fc);
		System.out.println(request.getStrrequest());
		System.out.println(respnose.getStrrespnose());
	}
}
