package com.java.search;

public class BinarySearchImplementation {
	
	
	public static int getIndex(int[] arr,int key,int low,int high)
	{
		int mid=0;
		
		while(low<=high)
		{
			mid=(high+low)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
				continue;
			}
			else
			{
				low=mid+1;
				continue;
			}
		}
		return mid;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {3,7,11,35,81,99};
		int key=81;
		System.out.println("Index : "+BinarySearchImplementation.getIndex(input, key, 0, input.length));
		
		}

}
