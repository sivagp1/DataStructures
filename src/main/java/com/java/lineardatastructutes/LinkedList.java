package com.java.lineardatastructutes;

public class LinkedList {
	
	Node head;
	
	public void printLinkedList(LinkedList list)	{
		
		Node currNode = list.head;
		System.out.println();
		while(currNode != null)	{
			System.out.print(" " + currNode.getValue());
			currNode = currNode.getNext();
		}
	}
	
	public LinkedList insert(LinkedList list, int value)	{
		
		Node node = new Node(value);
		if(list.head == null)	{
			list.head = node;
		}
		else	{
			Node currNode = list.head;
			while(currNode.getNext() != null)	{
				currNode = currNode.getNext();
			}
			currNode.setNext(node);
		}
		return list;
	}
	
	public LinkedList delete(LinkedList list, int val)	{
		
		Node node = list.head;
		Node prevNode = null;
		if(node != null && node.getValue() == val)	{
			list.head = node.getNext();
			return list;
		}
		
		while(node != null && node.getValue() != val)	{
			prevNode = node;
			node = node.getNext();
		}
		
		if(node == null)
			System.out.println("Key not found");
		
		if(node != null)	
			prevNode.next = node.next;
		
		return list;
		
	}
	
}

class Node {

	int value;
	Node next;
	
	public Node(int value) {
		super();
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}

