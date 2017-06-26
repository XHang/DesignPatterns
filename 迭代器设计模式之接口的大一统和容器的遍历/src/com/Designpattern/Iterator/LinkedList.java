package com.Designpattern.Iterator;
/*
 * 模拟LInkedList的实现
 */
public class LinkedList implements Collections{
	int size=0;
	Node head;			//定义了链表的头节点
	Node tail;			//定义了链表的尾节点
	public void add(Object o){
		Node node=new Node(o,null);	//当用户往链表里面添加一个新的的节点时
		if(head==null){					//判断链表有没有头节点
			head=node;					//如果没有头节点就让新来的节点成为头节点和尾节点。现在链表只有一个节点，该节点当然既是头节点，也是尾节点
			tail=node;
		}
		else{							
			tail.setNext(node);			//如果头节点已经有了，就让最后一个节点拉住新来的节点的小手。
			tail=node;					//当然新来的节点就是最后一个节点了
		}
		size++;							//每添加一个节点，链表长度+1.其实size是冗余数据，也可以遍历链表来取得链表的长度。
		
	}
	public int size(){
		return size;
	}
	public Iterator iterator() {
		return new Iterator(){
			int currentIndex=0;				
			@Override
			public boolean hashnext() {
				if(currentIndex>=size) return false;
				return true;
			}

			@Override
			public Object next() {
				Node ergodic=null;
				for(int i=0;i<=currentIndex;i++){
					if(i==0){
						ergodic=head;
					}
					else{
						ergodic=ergodic.getNext();
					}
				}
				currentIndex++;
				return ergodic.getO();
			}
			
		};
	}
}
