package com.java.Strings;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "India is a great nation";
		String[] words=input.split(" ");
		String reverseString ="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			reverseString=reverseString+" "+revWord;
		}
		System.out.println("Reversed String : " +reverseString);

	}

}
