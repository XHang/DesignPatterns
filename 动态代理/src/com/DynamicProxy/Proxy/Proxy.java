package com.DynamicProxy.Proxy;
/*
 * 动态代理的生成器
 */
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class Proxy {
	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception { //第一个参数是被代理对象实现的接口，第二个参数是你要处理的业务处理器
		String methodStr = "";						//定义方法名字符串
		String rt = "\r\n";							//定义回车符
		Method[] methods = infce.getMethods();		//取出被代理对象的接口的方法数组
		for(Method m : methods) {					//构造实现接口里面的每一个方法
			methodStr += "@Override" + rt + 
						 "public void " + m.getName() + "() {" + rt +
						 "    try {" + rt +
						 "    Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +		//生成的代理类：获得接口当前方法的方法对象
						 "    h.invoke(this, md);" + rt +																//生成的代理类:当用户调用代理对象的方法时，执行里面的业务逻辑处理器
						 "    }catch(Exception e) {e.printStackTrace();}" + rt +
						
						 "}";
		}
		
		String src = 															//构建代理类的java代码																					
			"package com.DynamicProxy.Proxy;" +  rt +
			"import java.lang.reflect.Method;" + rt +
			"public class $Proxy1 implements " + infce.getName() + "{" + rt +
			"    public $Proxy1(InvocationHandler h) {" + rt +
			"        this.h = h;" + rt +
			"    }" + rt +
			
			
			" com.DynamicProxy.Proxy.InvocationHandler h;" + rt +
							
			methodStr +
			"}";
		String fileName = 
			System.getProperty("user.dir")+"/src/com/DynamicProxy/Proxy/$Proxy1.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		//load into memory and create an instance
		URL[] urls = new URL[] {new URL("file:/"+System.getProperty("user.dir")+"/src/")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.DynamicProxy.Proxy.$Proxy1");
		System.out.println(c);
		
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		Object m = ctr.newInstance(h);
		//m.move();

		return m;			//new出代理对象，并返回
	}
}
