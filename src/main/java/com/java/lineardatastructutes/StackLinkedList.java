package com.java.lineardatastructutes;

public class StackLinkedList {

	private Node firstEle = null;
	
	public void push(int data)	{
		
		Node node = new Node(data);
		node.setNext(firstEle);
		firstEle = node;
	}
	
	public Node pop()	{
		
		Node tmp = firstEle;
		firstEle = firstEle.getNext();;
		return tmp;
	}
	
	public void printStack()	{
		
		Node node = firstEle;
		while(node != null)	{
			System.out.print(node.getValue() + " ");
			node = node.getNext();
		}
		
	}

}

