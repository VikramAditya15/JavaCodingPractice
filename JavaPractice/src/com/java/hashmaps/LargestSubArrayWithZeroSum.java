package com.java.hashmaps;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {
	
	
	public static int getLargestSubArray(int[] arr)
	{
		HashMap<Integer, Integer> subArray=new HashMap<Integer, Integer>();
		
		int maxlen=0;
		int i=-1;
		int sum=0;
		subArray.put(sum,i);
		while(i<arr.length-1)
		{
			i++;
			sum+=arr[i];
			if(subArray.containsKey(sum)==false)
			{
				subArray.put(sum, i);
			}
			else
			{
				int len=i-subArray.get(sum);
				if(maxlen<len)
				{
					maxlen=len;
				}
			}	
		}
		return maxlen;	
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {2,8,-3,-5};
		System.out.println("Largest Sub Array Size : "+LargestSubArrayWithZeroSum.getLargestSubArray(input));

	}

}
