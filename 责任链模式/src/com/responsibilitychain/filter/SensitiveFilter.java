package com.responsibilitychain.filter;

import com.responsibilitychain.abstractFilter.Filter;
import com.responsibilitychain.webelement.Request;
import com.responsibilitychain.webelement.Respnose;

/*
 * 该类是实现过滤敏感信息的类
 */
public class SensitiveFilter implements Filter {
	public void doFilter(Request request, Respnose respnose,FilterChain fc) {
		request.setStrrequest(request.getStrrequest().replaceAll("续一秒", "*根据相关法律法规，以下结果不予显示*")+"...敏感信息处理");
		fc.doFilter(request, respnose,fc);
		respnose.setStrrespnose(respnose.getStrrespnose()+"...敏感信息处理");
	}

}
