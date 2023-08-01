package com.java.arraysProgramming;

public class FirstRepeatedNumber {
	
	
	public int firstElementKTime(int[] a, int n, int k) { 
        
	       int repeatedNumber=0;
	       boolean flag=false;
	        for(int i=0;i<n-1;i++)
	        {
	        	if(flag==false)
	        	{
	        		repeatedNumber=a[i];
		            for(int j=i+1;j<n-1;j++)
		            {
		            	System.out.println("a[j] : "+a[j]);
		            	 if(repeatedNumber==a[j]){
		            		 flag=true;
		 	                break;
		            }
		            	 else
		            	 {
		            		 continue;
		            	 }
		           
		            }
	        	}
	        	else
	        	{
	        		break;
	        	}
	            
	        }
	        return repeatedNumber;
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRepeatedNumber firstRepeatedNumber=new FirstRepeatedNumber();
		int [] a= {1,7,4,3,4,8,7};
		int n=7;
		int k=2;
		System.out.println("First Repeated Number => " +firstRepeatedNumber.firstElementKTime(a,n,k));

	}

}
