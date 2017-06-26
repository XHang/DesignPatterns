package com.Designpattern.Iterator;
/*
 * 链表的节点对象，这个节点即持有本身数据，还拉着下一个节点的小手
 */
public class Node {
	Object o;
	public Node(Object o, Node next) {
		super();
		this.o = o;
		this.next = next;
	}
	Node next;
	public Object getO() {
		return o;
	}
	public void setO(Object o) {
		this.o = o;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
