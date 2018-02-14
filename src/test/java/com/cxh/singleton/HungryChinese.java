package com.cxh.singleton;

/**
 * 单例设计模式中的饿汉式
 * @author Administrator
 * 只有当调用方想获取对象时，才new一个对象给它
 * 存在线程并发性的问题。以下代码可以解释。
 * 这种方式减少了锁的判断次数，效率会稍微高。。。。点吧
 *
 */
public class HungryChinese {
	static  HungryChinese  object=null;
	//构造函数私有化，不允许其他程序通过构造函数创建对象
	private HungryChinese(){};
	public static HungryChinese getInStance(){
		//判断1，如果有对象了，就直接返回这个对象，不用判断锁
		if(object==null)
			//静态对象锁
			synchronized(HungryChinese.class){
				//判断2 如果线程1先进来同步锁，new完对象退出，然后线程2进来，此时再判断一下对象是否为空，避免new多个对象
				if(object==null)
					//好饿啊，吃一个饿汉对象
					object=new HungryChinese();
			}
		return object;
	}
}
