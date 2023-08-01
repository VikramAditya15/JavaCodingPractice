package com.java.arraysProgramming;

public class EquilibriumPoint {
	
	
	 public static int equilibriumPoint(long a[], int n) {

	        // Your code here
	    long LSum,RSum=0;
	       if(n==1)
	        return 1;
	        long[] sum=new long[n];
	        sum[0]=a[0];
	        for(int i = 1;i<n ;i++){
	            sum[i]=a[i]+sum[i-1];
	        }
	        for(int i = 1 ; i < n-1;i++){
	            LSum=sum[i]-a[i];
	            RSum=sum[n-1]-sum[i];
	            if(LSum == RSum)
	            {
	               return i+1; 
	            }
	            
	        }
	        return -1;
	        
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] input= {1,3,5,2,2};
		EquilibriumPoint.equilibriumPoint(input, input.length);

	}

}
