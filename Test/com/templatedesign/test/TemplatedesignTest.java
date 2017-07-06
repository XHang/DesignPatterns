package com.templatedesign.test;

import com.templatedesign.achievedesign.MakeCake;
import com.templatedesign.model.Cask;

/**
 * 模板设计的测试类
 * @author Administrator
 *
 */
public class TemplatedesignTest {
	public static void main(String[] args) {
		//new  一个我们自己的实现类。调用模板方法，嵌入自己的逻辑
		Cask cask = new MakeCake().makeCake();
		System.out.println(cask.getDesc());
	}
}
