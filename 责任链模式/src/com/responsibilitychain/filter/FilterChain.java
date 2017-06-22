package com.responsibilitychain.filter;

import java.util.ArrayList;
import java.util.List;

import com.responsibilitychain.abstractFilter.Filter;
import com.responsibilitychain.webelement.Request;
import com.responsibilitychain.webelement.Respnose;

/*
 * 该类是过滤器链条的类，主要存储过滤器数组并统一对某信息进行过滤
 */
public class FilterChain implements Filter {

	int index=0;		//保存当前执行的链条索引
	List<Filter> list=new ArrayList<Filter>();  	//保存着所有链条
	/**
	 * 为过滤器链条添加一个过滤器
	 * @param filter
	 */
	public  void addFilter(Filter filter){
		list.add(filter);
	}
	//执行过滤链
	public void doFilter(Request request, Respnose respnose,FilterChain fc) {
		if(index==list.size()) {
			return ;
		}
		Filter f=list.get(index);
		index++;
		f.doFilter(request, respnose,fc);
	}

}
