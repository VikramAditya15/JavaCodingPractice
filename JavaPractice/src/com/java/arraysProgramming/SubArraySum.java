package com.java.arraysProgramming;

import java.util.ArrayList;

public class SubArraySum {
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> subArray=new ArrayList<Integer>();
        int sum=0;
        
            for(int i=0;i<n;i++)
        {
            sum=arr[i];
            subArray.clear();
            for(int j=i+1;j<n-1;j++)
            {
                subArray.add(i);
                sum=sum+arr[j];
                if(arr[i]+arr[j]==s)
                {
                   subArray.add(j);
                   return subArray;
                }
                else if(sum<s)
                {
                    subArray.add(j);
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        return subArray;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {1,2,3,7,5};
		int n=5;
		int k=12;
		ArrayList<Integer> output=SubArraySum.subarraySum(input, n, k);
		for(int i=0;i<output.size();i++)
		{
			System.out.println("Elements : "+output.get(i));
		}

	}

}
