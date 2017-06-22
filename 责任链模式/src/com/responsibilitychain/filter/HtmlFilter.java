package com.responsibilitychain.filter;

import com.responsibilitychain.abstractFilter.Filter;
import com.responsibilitychain.webelement.Request;
import com.responsibilitychain.webelement.Respnose;

/*
 * 该类是html脚本过滤程序
 */
public class HtmlFilter implements Filter {
	
	public void doFilter(Request request, Respnose respnose,FilterChain fc) {
		request.setStrrequest(request.getStrrequest().replaceAll("<", "[").replaceAll(">", "]")+"....Html处理");
		fc.doFilter(request, respnose,fc);
		respnose.setStrrespnose(respnose.getStrrespnose()+"....Html处理");
		
	}

}
