package com.java.arraysProgramming;

public class ZigZagArray {
	


	    public void zigZag(int a[], int n){
	        // Code your solution here. 
	        
	       int index=0;
	       while(index<n-1)
	       {
	           if(index%2==0)
	           {
	               if(a[index]>a[index+1])
	               {
	                   swap(a,index,index+1);
	               }
	           }
	           else
	           {
	               if(a[index]<a[index+1])
	               {
	                    swap(a,index,index+1);
	               }
	           }
	           index++;
	       }
	       for(int i:a)
	       {
	    	   System.out.print(i+" "); 
	       }
	       
	        
	    }
	    
	    public void swap(int[]a,int left,int right)
	    {
	        int temp=a[left];
	        a[left]=a[right];
	        a[right]=temp;
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZigZagArray zigzag=new ZigZagArray();
		int [] input = {2,1,7,9,5,7};
		zigzag.zigZag(input, input.length);

	}

}
