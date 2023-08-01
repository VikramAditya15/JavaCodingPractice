package com.java.Strings;

public class FindUncommonChars {

	static String UncommonChars(String A, String B)
    {
       StringBuilder sb=new StringBuilder();
       
       for(int c=65;c<=122;c++)
       {
           char ch=(char) c;
           boolean isInA=A.contains(""+ch);
           boolean isInB=B.contains(""+ch);
           if(isInA && !isInB || !isInA && isInB)
           {
               sb.append(ch);
           }
       }
    return sb.length()==0 ? "-1": sb.toString();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Uncommon chars :" +FindUncommonChars.UncommonChars("geeksforgeeks", "geeksquiz"));

	}

}
