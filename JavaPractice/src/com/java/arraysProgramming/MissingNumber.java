package com.java.arraysProgramming;

public class MissingNumber {

	int missingNumber(int array[], int n) {
        // Your Code Here
        
        
        for(int number:array)
        {

            if(number!=n)
            {
                continue;
            }
            else
            {
                n=n-1;
                continue;
            }
        }
       
        return n;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber mn=new MissingNumber();
		int[] arr= {1,2,3,5};
		int n=5;
		System.out.println(mn.missingNumber(arr, n));
		
	}

}
