package com.java.arraysProgramming;

import java.util.ArrayList;

public class FindLeaders {
	
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        ArrayList<Integer> leaders=new ArrayList<Integer>();
        boolean flag=false;
        for(int i=0; i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    if(j==n-1)
                    {
                        leaders.add(arr[i]);
                        break;
                    }
                    else
                    {
                       continue;  
                    }
                }
                else
                {
                    break;
                }
            }
        }
        leaders.add(arr[n-1]);
        return leaders;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {16,17,4,3,5,2};
		FindLeaders.leaders(input, input.length);

	}

}
