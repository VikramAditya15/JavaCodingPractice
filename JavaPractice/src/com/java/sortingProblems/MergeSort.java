package com.java.sortingProblems;

public class MergeSort {
	
	public static void conquer(int[] arr,int si,int mid,int ei)
	{
		int[] mergedArray=new int[ei-si+1];
		
		int indx1=si;
		int indx2=mid+1;
		int x=0;
		
		while(indx1<=mid && indx2<=ei)
		{
			if(arr[indx1]<=arr[indx2])
			{
				mergedArray[x++]=arr[indx1++];
			}else
			{
				mergedArray[x++]=arr[indx2++];
			}
		}
		
		while(indx1<=mid)
			
		{
			mergedArray[x++]=arr[indx1++];
		}
		
		while(indx2<=ei)
			
		{
			mergedArray[x++]=arr[indx2++];
		}
		for(int i=0,j=si;i<mergedArray.length;i++,j++)
		{
			arr[j]=mergedArray[i];
		}
		
		
	}
	
	
	public static void divide(int[] arr,int si,int ei)
	{
		if(si>=ei) {
			return;
		}
		
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {6,3,9,5,2,8};
		
		MergeSort.divide(input,0,5);
		
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+ " ");
		}

	}

}
