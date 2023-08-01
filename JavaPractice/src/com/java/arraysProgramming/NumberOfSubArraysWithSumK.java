package com.java.arraysProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumberOfSubArraysWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] input= {3,5,6,1,5,9,0,-2,7};
		System.out.println("Output : " +NumberOfSubArraysWithSumK.calculateNumberOfSubArrays(input,8));
	

	}
	
	public static ArrayList<ArrayList<Integer>> calculateNumberOfSubArrays(int[] arr,int sum)
	{
		int s=0;
		ArrayList<ArrayList<Integer>> op=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> in=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			in.clear();
			in.add(arr[i]);
			s=s+arr[i];
			for(int j=1;j<arr.length;j++)
			{
				in.add(arr[j]);
				if(arr[i]+arr[j]==sum)
				{
					op.add(in);
				}
				else
				{
					continue;
				}

			}
		}
		return op;
	}
}

