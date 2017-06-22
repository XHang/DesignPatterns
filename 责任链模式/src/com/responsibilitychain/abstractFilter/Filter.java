package com.responsibilitychain.abstractFilter;

import com.responsibilitychain.filter.FilterChain;
import com.responsibilitychain.webelement.Request;
import com.responsibilitychain.webelement.Respnose;

/*
 * 该接口是过滤器接口，或者称拦截器接口
 */
public interface Filter {
	/**
	 * 当执行到该过滤条时
	 * @param request  请求
	 * @param respnose  响应
	 * @param fc 整个链条  传入该值是为了能在当前链条过滤后结束，执行下一个过滤
	 */
	public void doFilter(Request request,Respnose respnose,FilterChain fc);
	//传入链条是为了保存索引值。或者说让程序知道链条滚到哪了
}
