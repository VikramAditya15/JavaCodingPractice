package com.java.arraysProgramming;

public class Arrange012s {
	
	
	public static int[] sort012(int a[], int n)
    {
        // code here
       int zero=0;
       int one=0;
       int two=0;
       
       for(int i=0;i<n;i++)
       {
           if(a[i]==0)
           {
               zero+=1;
           }
           else if(a[i]==1)
           {
               one+=1;
           }
           else
           {
             two+=1;  
           }
       }
       
       int i=0;
       while(i<zero)
       {
           a[i]=0;
           i++;
       }
       
       while(i<zero+one)
       {
           a[i]=1;
           i++;
       }
       
       while(i<zero+one+two)
       {
           a[i]=2;
           i++;
       }
        return a;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] input= {0,2,1,2,0};
		int[] output=sort012(input,input.length);
		for(int i:output)
		{
			System.out.println(i);
		}
		

	}

}
