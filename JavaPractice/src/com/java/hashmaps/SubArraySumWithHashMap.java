package com.java.hashmaps;

import java.util.HashMap;

public class SubArraySumWithHashMap {
	
	
	public static void returnSubArrayIndex(int[] arr,int sum)
	{
		
		int start=0;
		int end=-1;
		int currSum=0;
		int maxlen=0;
		HashMap<Integer, Integer> result=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			currSum+=arr[i];
			
			if(currSum-sum==0)
			{
				start=0;
				end=i;
				break;
			}
			if(result.containsKey(currSum-sum))
			{
				start=result.get(currSum-sum)+1;
				end=i;
				int len=(end-start)+1;
				if(maxlen<len){
					maxlen=len;
				}
				break;
			}
			result.put(currSum,i);
			
		}
		if(end==-1)
		{
			System.out.println("Not Found !!");
		}
		else
		{
			System.out.println(start+" "+end+ " "+maxlen);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {10,15,-5,15,-10,5};
		SubArraySumWithHashMap.returnSubArrayIndex(input, 5);

	}

}
