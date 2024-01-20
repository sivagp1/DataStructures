package com.java.lineardatastructutes;


public class Queue {

	Node front = null;
	Node rear = null;
	
	public void enque(int val)	{
		
		Node node = new Node(val);
		if(this.rear == null)	{
			this.front = this.rear = node;
			return;
		}
		this.rear.setNext(node);
		this.rear = node;
	}
	
	public Node dequeue()	{
		
		if(this.front == null)	{
			return null;
		}
		Node tmp = this.front;
		this.front = this.front.getNext();
		if(this.front == null)
			this.rear = null;
		
		return tmp;
		
		
	}
	
	public void printStack()	{
		
		Node node = front;
		while(node != null)	{
			System.out.print(node.getValue() + " ");
			node = node.getNext();
		}
		System.out.println();
		
	}
}

