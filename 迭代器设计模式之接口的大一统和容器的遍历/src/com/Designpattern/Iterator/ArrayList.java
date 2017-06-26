package com.Designpattern.Iterator;
/*
 * 模拟ArrayList的实现
 */
public class ArrayList implements Collections {
	Object[] object=new Object[10];
	int index=0;				
	@Override
	public void add(Object o){
		if(index==object.length){		//如果添加的元素超出了一开始定义的数组长度，则new一个新的数组，长度为原来的2倍
			Object[] newobject=new Object[index*2];
			System.arraycopy(object, 0, newobject, 0, index);		//复制旧数组到新数组取。第一个参数是原数组，2是原数组复制的开始位置，3是新数组，四是复制到新数组的开始位置。5不说
			object=newobject;
		}
		object[index]=o;
		index++;
	}
	@Override
	public int size(){
		return index;
	}
	@Override
	public Iterator iterator() {				//获取迭代器对象
		return new Iterator(){
			int currentIndex=0;					//定义当前遍历的元素角标
			@Override
			public boolean hashnext() {		//判断当前想访问的元素是否存在
				if(currentIndex>=index) return false;
				return true;
			}

			@Override
			public Object next() {
				Object o=object[currentIndex];
				currentIndex++;
				return o;
			}
			
		};
	}
}
