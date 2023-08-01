package com.java.listPractice;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static LinkedList<Integer> reverseLL(LinkedList<Integer> inputLL)
	{
		LinkedList<Integer> reversedLL=new LinkedList<Integer>();
		for(int i=inputLL.size()-1;i>=0;i--)
		{
			reversedLL.add(inputLL.get(i));
		}
		return reversedLL;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> originalLL=new LinkedList<Integer>();
		originalLL.add(1);
		originalLL.add(2);
		originalLL.add(3);
		originalLL.add(4);
		originalLL.add(5);
		
		for(int i=0;i<originalLL.size();i++)
		{
			System.out.print(originalLL.get(i)+" -> ");
		} 
		System.out.println();
		
		LinkedList<Integer> reversedLL=ReverseLinkedList.reverseLL(originalLL);
		
		for(int i=0;i<reversedLL.size();i++)
		{
			System.out.print(reversedLL.get(i)+" -> ");
		} 

	}

}
