package com.java.Strings;

public class FirstRepeatedCharInString {

	static char firstRep(String S)
    {
        // your code here 
       char ch='#';
       S=S.toLowerCase();
       for(int i=0;i<S.length();i++)
       {
           ch=S.charAt(i);
           String sub=S.substring(i+1);
           if(sub.contains(""+ch))
           {
               return ch;
           }
           else
           {
        	   ch='\0';
        	   continue; 
           }
       }
       return ch;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Repeated Char : "+FirstRepeatedCharInString.firstRep("Gs"));
		
	}

}
