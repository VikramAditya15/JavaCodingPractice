package com.java.listPractice;

public class LLImplementation {
	
	Node head;
	private int size;
	
	LLImplementation()
	{
		this.size=0;
	}
	
	class Node
	{
		
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	public void addFirst(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		else
		{
			newNode.next=head;
			head=newNode;
			return;
		}
	}
	
	public void addLast(String data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=null)
		{
			currentNode=currentNode.next;
			
		}
		currentNode.next=newNode;
	}
	
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is Empty !!");
		}
		
		Node currentNode=head;
		while(currentNode!=null)
		{
			System.out.print(currentNode.data + " -> ");
			currentNode=currentNode.next;
		}
		System.out.print("NULL");
	}
	
	public void deleteLast()
	{
		
		if(head==null)
		{
			System.out.println("List is Empty !!");
			return;
		}
		size--;
		if(head.next==null)
		{
			head=null;
			return;
		}
		else
		{
		Node secondLastNode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null)
		{
			lastNode=lastNode.next;
			secondLastNode=secondLastNode.next;
		}
		secondLastNode.next=null;
		}
		
	}
	
	public void deleteFirst()
	{
		
		if(head==null)
		{
			return;
		}
		else
		{
			size--;
		head=head.next;
		
		}
		
	}
	
	public int getSize()
	{
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLImplementation list=new LLImplementation();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("list");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());

	}

}
